package com.example.hw27b.repository;

import com.example.hw27b.model.Order;
import org.springframework.data.repository.CrudRepository;

/*
 *
 * @author Roman Netesa
 *
 */
public interface OrderRepository extends CrudRepository<Order, Integer> {
}
