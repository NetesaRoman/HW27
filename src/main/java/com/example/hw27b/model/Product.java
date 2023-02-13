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
@Table(schema = "my_shop")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String description;

    private Double price;
}
