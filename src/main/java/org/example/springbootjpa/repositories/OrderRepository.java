package org.example.springbootjpa.repositories;

import org.example.springbootjpa.entities.Order;
import org.example.springbootjpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
