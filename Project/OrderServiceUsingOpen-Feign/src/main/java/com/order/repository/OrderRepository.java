package com.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.order.model.Orders;

public interface OrderRepository extends JpaRepository<Orders, Long> {

}
