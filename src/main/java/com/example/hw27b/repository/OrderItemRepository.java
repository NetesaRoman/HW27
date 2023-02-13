package com.example.hw27b.repository;

import com.example.hw27b.model.OrderItem;
import org.springframework.data.repository.CrudRepository;

/*
 *
 * @author Roman Netesa
 *
 */
public interface OrderItemRepository extends CrudRepository<OrderItem, Integer> {
}
