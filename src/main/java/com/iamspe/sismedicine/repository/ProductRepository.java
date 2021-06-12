package com.iamspe.sismedicine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iamspe.sismedicine.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
