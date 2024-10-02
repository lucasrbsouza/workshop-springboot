package org.example.springbootjpa.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.example.springbootjpa.entities.pk.OrderItemPk;

import java.io.Serializable;

@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {
    private static final long seriaVersionUID = 1L;

    @EmbeddedId
    private final OrderItemPk id = new OrderItemPk();

    @Setter
    @Getter
    private Integer quantity;
    @Setter
    @Getter
    private Double price;

    public OrderItem() {
    }

    public OrderItem(Order order, Product product, Integer quantity, Double price) {
        id.setOrder(order);
        id.setProduct(product);
        this.quantity = quantity;
        this.price = price;
    }

    @JsonIgnore
    public Order getOrder(){
        return id.getOrder();
    }
    public void setOrder(Order order){
        id.setOrder(order);
    }

    public Product getProduct() {
        return id.getProduct();
    }

    public void setProduct(Product product) {
        id.setProduct(product);
    }
}
