package com.example.hw27b.dto;

import com.example.hw27b.model.Client;
import com.example.hw27b.model.OrderItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

/*
 *
 * @author Roman Netesa
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {
    private Integer id;

    private Client client;

    private List<OrderItem> orderItems;
}
