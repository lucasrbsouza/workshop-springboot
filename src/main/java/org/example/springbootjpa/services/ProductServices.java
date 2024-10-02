package org.example.springbootjpa.services;

import org.example.springbootjpa.entities.Product;
import org.example.springbootjpa.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServices {

    private final ProductRepository respository;

    public ProductServices(ProductRepository respository) {
        this.respository = respository;
    }

    public List<Product> findAll() {
        return respository.findAll();
    }
    public Product findById(Long id){
        return respository.findById(id).get();
    }
}
