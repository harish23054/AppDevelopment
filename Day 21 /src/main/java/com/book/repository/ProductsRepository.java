package com.book.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.model.Products;

public interface ProductsRepository extends JpaRepository<Products,Long> {


	    Products findByPid(Long pid);

	    void deleteByPid(Long pid);

		Optional<Products> findByProductName(String productName);
}
