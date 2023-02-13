package com.example.hw27b.dto;

import com.example.hw27b.model.Client;
import jakarta.persistence.*;
import lombok.Data;

/*
 *
 * @author Roman Netesa
 *
 */
@Data
public class AddressDto {

    private Integer id;

    private Client client;

    private String country;

    private String city;

    private String street;

    private String house;

    public AddressDto(String country, String city, String street, String house) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
    }
}
