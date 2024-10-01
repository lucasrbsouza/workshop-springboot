package org.example.springbootjpa.repositories;

import org.example.springbootjpa.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<User, Long> {

}
