package com.devsuperior.myfirstproject.controllers;

import com.devsuperior.myfirstproject.entities.Product;
import com.devsuperior.myfirstproject.repositories.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    public ProductController() {
        super();
    }

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> list = productRepository.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Product product = productRepository.findById(id).get();
        return ResponseEntity.ok(product);
    }
}
