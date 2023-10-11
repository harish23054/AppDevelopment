package com.example.newprojectt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.newprojectt.model.PostsEntity;

public interface PostsRepository extends JpaRepository<PostsEntity, Long>{

}
