package com.iamspe.sismedicine.service;

import com.iamspe.sismedicine.dto.MessageRersponseDTO;
import com.iamspe.sismedicine.entity.Product;
import com.iamspe.sismedicine.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public MessageRersponseDTO createdProduct(Product product){
        Product saveProduct = productRepository.save(product);
        return MessageRersponseDTO
                .builder()
                .message("Created product with ID" + saveProduct)
                .build();
    }
}
