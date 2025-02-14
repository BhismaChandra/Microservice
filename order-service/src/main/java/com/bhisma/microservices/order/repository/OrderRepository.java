package com.bhisma.microservices.order.repository;

import com.bhisma.microservices.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
