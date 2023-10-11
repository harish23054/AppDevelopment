package com.example.newprojectt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.newprojectt.model.User;

public interface UserRepository extends JpaRepository<User,String>{

   
    
}
