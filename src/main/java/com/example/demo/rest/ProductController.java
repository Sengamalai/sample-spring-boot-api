package com.example.demo.rest;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.vo.Product;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return Arrays.asList(
            new Product(1, "Laptop", 999.99),
            new Product(2, "Smartphone1", 499.99)
        );
    }
}