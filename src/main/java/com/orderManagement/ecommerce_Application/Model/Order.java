package com.orderManagement.ecommerce_Application.Model;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Data
public class Order {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String userId;
    private String status;

    @OneToMany(cascade = CascadeType.ALL)
    private List<OrderItem> items;





}
