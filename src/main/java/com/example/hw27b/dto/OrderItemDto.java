package com.example.hw27b.dto;

import com.example.hw27b.model.Order;
import com.example.hw27b.model.Product;

import lombok.Data;

/*
 *
 * @author Roman Netesa
 *
 */
@Data
public class OrderItemDto {
    private Integer id;

    private Product product;

    private Order order;

    private Integer count;
}
