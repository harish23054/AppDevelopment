package com.book.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.Service.ProductService;
import com.book.constant.Api;
import com.book.dto.request.ProductRequest;
import com.book.dto.response.ProductResponse;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(Api.PRODUCT)
@RequiredArgsConstructor
@Tag(name = "Product")
public class ProductController {

    private final ProductService productService;

    @PostMapping("/post")
    public ResponseEntity<String> saveProduct(@RequestBody ProductRequest request) {
        boolean isSaved = productService.saveProduct(request);
        return isSaved ? ResponseEntity.status(201).body("Product added successfully!")
                : ResponseEntity.badRequest().build();
    }

    @GetMapping("/all")
    public ResponseEntity<List<ProductResponse>> getAllProducts() {
        List<ProductResponse> productList = productService.getAllProducts();
        return !productList.isEmpty() ? ResponseEntity.status(200).body(productList)
                : ResponseEntity.noContent().build();
    }

    @GetMapping("/{pid}")
    public ResponseEntity<ProductResponse> getProduct(@PathVariable Long pid) {
        ProductResponse productResponse = productService.getProduct(pid);
        return productResponse != null ? ResponseEntity.ok().body(productResponse) : ResponseEntity.notFound().build();
    }

    @PutMapping("/update/{pid}")
    public ResponseEntity<ProductResponse> updateProduct(@RequestBody ProductRequest request, @PathVariable Long pid) {
        ProductResponse productResponse = productService.updateProduct(request, pid);
        return productResponse != null ? ResponseEntity.ok().body(productResponse) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/delete/{pid}")
    public ResponseEntity<String> deleteProduct(@PathVariable Long pid) {
        boolean isDeleted = productService.deleteProduct(pid);
        return isDeleted ? ResponseEntity.ok().body("Product deleted successfully!")
                : ResponseEntity.notFound().build();
    }

}
