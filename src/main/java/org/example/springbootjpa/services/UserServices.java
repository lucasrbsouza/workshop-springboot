package org.example.springbootjpa.services;

import org.example.springbootjpa.entities.User;
import org.example.springbootjpa.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {

    private final UserRepository respository;

    public UserServices(UserRepository respository) {
        this.respository = respository;
    }

    public List<User> findAll() {
        return respository.findAll();
    }
    public User findById(Long id){
        return respository.findById(id).get();
    }

    public User insert(User obj){
        return respository.save(obj);
    }
}
