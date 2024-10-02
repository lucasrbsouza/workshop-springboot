package org.example.springbootjpa.config;

import org.example.springbootjpa.entities.Order;
import org.example.springbootjpa.entities.User;
import org.example.springbootjpa.entities.enums.OrderStatus;
import org.example.springbootjpa.repositories.OrderRepository;
import org.example.springbootjpa.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {

    private final UserRepository userRespository;
    private final OrderRepository orderrRespository;

    public TesteConfig(UserRepository userRespository, OrderRepository orderrRespository) {
        this.userRespository = userRespository;
        this.orderrRespository = orderrRespository;
    }


    @Override
    public void run(String... args) {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
        userRespository.saveAll(Arrays.asList(u1, u2));

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1, OrderStatus.DELIVERED);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2, OrderStatus.PAID);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1, OrderStatus.WAITING_PAYMENT);
        orderrRespository.saveAll(Arrays.asList(o1, o2, o3));
    }

}
