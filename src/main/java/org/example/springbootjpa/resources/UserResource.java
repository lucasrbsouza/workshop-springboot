package org.example.springbootjpa.resources;

import org.example.springbootjpa.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.example.springbootjpa.services.UserServices;

import java.util.List;


@RestController
@RequestMapping("/users")
public class UserResource {

    private final UserServices service;

    public UserResource(UserServices service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User user = service.findById(id);

        return ResponseEntity.ok().body(user);
    }
}
