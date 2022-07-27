package com.example.payrool.Databases;

import com.example.payrool.Entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}