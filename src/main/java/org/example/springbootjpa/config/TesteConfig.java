package org.example.springbootjpa.config;

import org.example.springbootjpa.entities.User;
import org.example.springbootjpa.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {

    private final UserRepository userRespository;

    @Autowired
    public TesteConfig(UserRepository userRespository) {
        this.userRespository = userRespository;
    }

    @Override
    public void run(String... args) {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        userRespository.saveAll(Arrays.asList(u1, u2));
    }

}
