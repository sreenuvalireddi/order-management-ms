package com.example.ordermanagementms.service;

import com.example.ordermanagementms.model.Order;
import com.example.ordermanagementms.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    // Get all orders
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    // Get order by ID
    public Optional<Order> getOrderById(Long id) {
        return orderRepository.findById(id);
    }

    // Create order
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    // Update order
    public Order updateOrder(Long id, Order orderDetails) {
        return orderRepository.findById(id).map(order -> {
            order.setOrderNumber(orderDetails.getOrderNumber());
            order.setCustomerName(orderDetails.getCustomerName());
            order.setCustomerEmail(orderDetails.getCustomerEmail());
            order.setTotalAmount(orderDetails.getTotalAmount());
            order.setStatus(orderDetails.getStatus());
            order.setOrderDate(orderDetails.getOrderDate());
            order.setShippingAddress(orderDetails.getShippingAddress());
            order.setActive(orderDetails.getActive());
            return orderRepository.save(order);
        }).orElseThrow(() -> new RuntimeException("Order not found with id: " + id));
    }

    // Delete order
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }

    // Get active orders
    public List<Order> getActiveOrders() {
        return orderRepository.findByActive("true");
    }

    // Search orders by customer name
    public List<Order> searchOrders(String customerName) {
        return orderRepository.findByCustomerNameContainingIgnoreCase(customerName);
    }
}
