package com.example.ordermanagementms.repository;

import com.example.ordermanagementms.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByActive(String active);
    List<Order> findByCustomerNameContainingIgnoreCase(String customerName);
}
