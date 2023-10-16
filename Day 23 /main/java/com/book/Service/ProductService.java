package com.book.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.book.dto.request.ProductRequest;
import com.book.dto.response.ProductResponse;
import com.book.model.Products;
import com.book.repository.ProductsRepository;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductService {

    private final ProductsRepository productRepository;

    
    public boolean saveProduct(ProductRequest request) {
        if (productRepository.findByProductName(request.getProductName()).isPresent()) {
            return false;
        }

        Products product = Products.builder()
                .productName(request.getProductName())
                .productPrice(request.getProductPrice())
                .description(request.getDescription())
                .productImage(request.getProductName())
                .build();

        productRepository.save(product);
        return true;
    }

    
    public List<ProductResponse> getAllProducts() {
        List<Products> productList = productRepository.findAll();

        return productList.stream()
                .map(this::mapProductToResponse)
                .collect(Collectors.toList());
    }

    
    public ProductResponse getProduct(Long pid) {
        Products product = productRepository.findByPid(pid);
        return mapProductToResponse(product);
    }

    
    public ProductResponse updateProduct(ProductRequest request, Long pid) {
        Products product = productRepository.findByPid(pid);

        if (product != null) {
            product.setProductName(request.getProductName());
            product.setProductPrice(request.getProductPrice());
            product.setDescription(request.getDescription());
            product.setProductImage(request.getProductName());
           

            productRepository.save(product);

            return mapProductToResponse(product);
        } else {
            throw new EntityNotFoundException("Product with pid " + pid + " not found");
        }
    }

    
    public boolean deleteProduct(Long pid) {
        Products product = productRepository.findByPid(pid);

        if (product != null) {
            productRepository.deleteByPid(pid);
            return true;
        } else {
            return false;
        }
    }

    private ProductResponse mapProductToResponse(Products product) {
        return ProductResponse.builder()
                .pid(product.getPid())
                .productName(product.getProductName())
                .productPrice(product.getProductPrice())
                .description(product.getDescription())
                .productName(product.getProductImage())
                .build();
    }

    
    public Products getProductModelId(Long pid) {
        return productRepository.findByPid(pid);
    }
}
