package org.example.springbootjpa.services;

import org.example.springbootjpa.entities.User;
import org.example.springbootjpa.repositories.UserRepository;
import org.example.springbootjpa.services.exceptions.ResourceNotFoundException;
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

    public User findById(Long id) {
        return respository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User obj) {
        return respository.save(obj);
    }

    public void delete(Long id) {
        respository.deleteById(id);
    }

    public User update(Long id, User obj) {
        User entity = respository.getReferenceById(id);
        updateData(entity, obj);

        return respository.save(entity);
    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }

}
