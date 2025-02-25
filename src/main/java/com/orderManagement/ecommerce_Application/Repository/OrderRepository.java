package com.orderManagement.ecommerce_Application.Repository;

import com.orderManagement.ecommerce_Application.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
