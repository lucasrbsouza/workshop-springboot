package org.example.springbootjpa.services;

import org.example.springbootjpa.entities.Order;
import org.example.springbootjpa.entities.User;
import org.example.springbootjpa.repositories.OrderRepository;
import org.example.springbootjpa.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServices {

    private final OrderRepository respository;

    public OrderServices(OrderRepository respository) {
        this.respository = respository;
    }

    public List<Order> findAll() {
        return respository.findAll();
    }
    public Order findById(Long id){
        return respository.findById(id).get();
    }
}
