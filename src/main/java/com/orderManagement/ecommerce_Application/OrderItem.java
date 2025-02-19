package com.orderManagement.ecommerce_Application;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productId;
    private int quantity;
    private double price;
}
