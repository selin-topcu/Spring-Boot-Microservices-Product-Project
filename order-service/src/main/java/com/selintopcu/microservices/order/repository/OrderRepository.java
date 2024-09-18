package com.selintopcu.microservices.order.repository;

import com.selintopcu.microservices.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
