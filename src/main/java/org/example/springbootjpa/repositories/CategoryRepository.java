package org.example.springbootjpa.repositories;

import org.example.springbootjpa.entities.Category;
import org.example.springbootjpa.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
