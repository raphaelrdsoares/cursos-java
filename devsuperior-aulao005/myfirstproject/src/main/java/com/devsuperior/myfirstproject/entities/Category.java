package com.devsuperior.myfirstproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Category implements Serializable {

    private Long id;
    private String name;

    @JsonIgnore
    private List<Product> products = new ArrayList<>();

    public Category() {}

    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addProducts(List<Product> products) {
        this.products = products;
    }
}
