package org.example.springbootjpa.resources;

import org.example.springbootjpa.entities.Order;
import org.example.springbootjpa.services.OrderServices;
import org.example.springbootjpa.services.OrderServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/orders")
public class OrderResource {

    private final OrderServices service;

    public OrderResource(OrderServices service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Order>> findAll(){
        List<Order> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id){
        Order Order = service.findById(id);

        return ResponseEntity.ok().body(Order);
    }
}
