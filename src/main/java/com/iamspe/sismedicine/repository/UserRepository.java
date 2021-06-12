package com.iamspe.sismedicine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iamspe.sismedicine.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
