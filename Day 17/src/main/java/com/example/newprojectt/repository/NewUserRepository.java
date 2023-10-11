package com.example.newprojectt.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import com.example.newprojectt.model.UserEntity;
public interface NewUserRepository extends JpaRepository<UserEntity,Long> {

}
