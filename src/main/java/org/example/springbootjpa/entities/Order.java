package org.example.springbootjpa.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;

@Getter
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "tb_order")
public class Order implements Serializable {
    private static final long seriaVersionUID = 1L;

    @Id
    @Setter
    private Long id;
    @Setter
    private Instant moment;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;

    public Order() {
    }

    public Order(Long id, Instant moment, User client) {
        this.id = id;
        this.moment = moment;
        this.client = client;
    }
}
