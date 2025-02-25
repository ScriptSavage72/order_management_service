package com.orderManagement.ecommerce_Application.Service;

import com.orderManagement.ecommerce_Application.Model.Order;
import com.orderManagement.ecommerce_Application.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    public Order placeOrder(Order order){
        return orderRepository.save(order);
    }

    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }

    public Order getOrderById(Long id){
        return orderRepository.findById(id).orElse(null);
    }

    public void deleteOrder(Long id){
        orderRepository.deleteById(id);
    }
}
