package org.example.springbootjpa.services;

import org.example.springbootjpa.entities.Category;
import org.example.springbootjpa.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServices {

    private final CategoryRepository respository;

    public CategoryServices(CategoryRepository respository) {
        this.respository = respository;
    }

    public List<Category> findAll() {
        return respository.findAll();
    }
    public Category findById(Long id){
        return respository.findById(id).get();
    }
}
