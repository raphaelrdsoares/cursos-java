package com.devsuperior.myfirstproject.repositories;

import com.devsuperior.myfirstproject.entities.Product;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class ProductRepository {

    private Map<Long, Product> map;

    public ProductRepository() {
        super();
        map = new HashMap<>();
    }

    public void save(Product toSave) {
        map.put(toSave.getId(), toSave);
    }

    public Product findById(Long id) {
        return map.get(id);
    }

    public List<Product> findAll() {
        return new ArrayList<>(map.values());
    }
}
