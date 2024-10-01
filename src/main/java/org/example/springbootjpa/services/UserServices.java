package org.example.springbootjpa.services;

import org.example.springbootjpa.entities.User;
import org.example.springbootjpa.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {

    @Autowired
    private UserRepository respository;

    public List<User> findAll() {
        return respository.findAll();
    }
    public User findById(Long id){
        return respository.findById(id).get();
    }
}
