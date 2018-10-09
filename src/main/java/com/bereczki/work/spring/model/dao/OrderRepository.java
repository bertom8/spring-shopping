package com.bereczki.work.spring.model.dao;

import com.bereczki.work.spring.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
