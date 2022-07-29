package com.devsuperior.myfirstproject;

import com.devsuperior.myfirstproject.entities.Category;
import com.devsuperior.myfirstproject.entities.Product;
import com.devsuperior.myfirstproject.repositories.CategoryRepository;
import com.devsuperior.myfirstproject.repositories.ProductRepository;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyfirstprojectApplication implements CommandLineRunner {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(MyfirstprojectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Category cat1 = new Category("Eletrônicos");
        Category cat2 = new Category("Livros");

        Product p1 = new Product("TV", 2700d, cat1);
        Product p2 = new Product("Domain Drive Design", 65d, cat2);
        Product p3 = new Product("PS5", 3500d, cat1);
        Product p4 = new Product("Docker para leigos", 39.99, cat2);

        cat1.addProducts(Arrays.asList(p1, p3));
        cat2.addProducts(Arrays.asList(p2, p4));

        categoryRepository.save(cat1);
        categoryRepository.save(cat2);

        productRepository.save(p1);
        productRepository.save(p2);
        productRepository.save(p3);
        productRepository.save(p4);
    }
}
