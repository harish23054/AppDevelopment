package com.book.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.model.Warddetails;

@Repository
public interface WarddetailsRepo extends JpaRepository<Warddetails,Long>{

	
}