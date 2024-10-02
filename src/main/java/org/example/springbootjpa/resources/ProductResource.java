package org.example.springbootjpa.resources;

import org.example.springbootjpa.entities.Product;
import org.example.springbootjpa.services.ProductServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/products")
public class ProductResource {

    private final ProductServices service;

    public ProductResource(ProductServices service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
        List<Product> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        Product Product = service.findById(id);

        return ResponseEntity.ok().body(Product);
    }
}
