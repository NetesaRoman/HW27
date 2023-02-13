package com.example.hw27b.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
 *
 * @author Roman Netesa
 *
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(schema = "my_shop", name ="order_item")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "fk_product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "fk_order_id")
    private Order order;

    private Integer count;


}
