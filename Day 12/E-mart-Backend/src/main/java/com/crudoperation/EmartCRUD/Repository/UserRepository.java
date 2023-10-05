package com.crudoperation.EmartCRUD.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudoperation.EmartCRUD.Entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{

}
