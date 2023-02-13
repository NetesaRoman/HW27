package com.example.hw27b.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/*
 *
 * @author Roman Netesa
 *
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(schema = "my_shop")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "fk_client_id")
    private Client client;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItems;
}
