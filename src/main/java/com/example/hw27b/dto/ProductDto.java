package com.example.hw27b.dto;

import lombok.Data;

/*
 *
 * @author Roman Netesa
 *
 */
@Data

public class ProductDto {
    private Integer id;

    private String name;

    private String description;

    private Double price;

    public ProductDto(String name, String description, Double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
