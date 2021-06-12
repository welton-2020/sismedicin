package com.iamspe.sismedicine.controller;

import com.iamspe.sismedicine.dto.MessageRersponseDTO;
import com.iamspe.sismedicine.entity.Product;
import com.iamspe.sismedicine.service.ProductService;
import lombok.Builder;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Builder
@RestController
@RequestMapping("api/v1/product")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageRersponseDTO createdProduct (@RequestBody Product product){
        return productService.createdProduct(product);
    }
}
