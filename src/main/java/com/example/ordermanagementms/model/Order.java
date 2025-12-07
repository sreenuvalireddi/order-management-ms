package com.example.ordermanagementms.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String orderNumber;

    @Column(nullable = false)
    private String customerName;

    @Column
    private String customerEmail;

    @Column
    private Double totalAmount;

    @Column
    private String status;

    @Column
    private LocalDateTime orderDate;

    @Column
    private String shippingAddress;

    @Column
    private String active = "true";
}
