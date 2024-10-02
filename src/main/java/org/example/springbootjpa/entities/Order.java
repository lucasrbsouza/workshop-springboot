package org.example.springbootjpa.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.example.springbootjpa.entities.enums.OrderStatus;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Getter
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "tb_order")
public class Order implements Serializable {
    private static final long seriaVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter
    private Long id;
    @Setter
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant moment;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;

    private Integer orderStatus;

    @OneToMany(mappedBy = "id.order")
    private Set<OrderItem> items = new HashSet<>();

    public Order() {
    }

    public Order(Long id, Instant moment, User client, OrderStatus orderStatus) {
        this.id = id;
        this.moment = moment;
        this.client = client;
        setOrderStatus(orderStatus);
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        if (orderStatus != null)
            this.orderStatus = orderStatus.getCode();
    }

    public OrderStatus getOrderStatus() {
        return OrderStatus.valueOf(orderStatus);
    }
}
