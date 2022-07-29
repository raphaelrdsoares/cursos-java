package com.devsuperior.myfirstproject.controllers;

import com.devsuperior.myfirstproject.entities.Category;
import com.devsuperior.myfirstproject.repositories.CategoryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    public CategoryController() {
        super();
    }

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> list = categoryRepository.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id) {
        Category category = categoryRepository.findById(id).get();
        return ResponseEntity.ok(category);
    }
}
