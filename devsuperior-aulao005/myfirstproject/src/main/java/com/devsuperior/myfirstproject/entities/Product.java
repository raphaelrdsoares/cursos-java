package com.devsuperior.myfirstproject.entities;

import java.io.Serializable;

public class Product implements Serializable {

    private Long id;
    private String name;
    private Double price;
    private Category category;

    public Product() {
        super();
    }

    public Product(Long id, String name, Double price, Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }
}
