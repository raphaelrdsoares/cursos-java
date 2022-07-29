package com.devsuperior.myfirstproject.repositories;

import com.devsuperior.myfirstproject.entities.Category;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class CategoryRepository {

    private Map<Long, Category> map;

    public CategoryRepository() {
        super();
        map = new HashMap<>();
    }

    public void save(Category toSave) {
        map.put(toSave.getId(), toSave);
    }

    public Category findById(Long id) {
        return map.get(id);
    }

    public List<Category> findAll() {
        return new ArrayList<>(map.values());
    }
}
