package org.example.springbootjpa.resources;

import org.example.springbootjpa.entities.Category;
import org.example.springbootjpa.services.CategoryServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/categorys")
public class CategoryResource {

    private final CategoryServices service;

    public CategoryResource(CategoryServices service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
        List<Category> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id){
        Category Category = service.findById(id);

        return ResponseEntity.ok().body(Category);
    }
}
