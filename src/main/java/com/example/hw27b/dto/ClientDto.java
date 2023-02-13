package com.example.hw27b.dto;

import com.example.hw27b.model.Address;

import lombok.AllArgsConstructor;
import lombok.Data;

/*
 *
 * @author Roman Netesa
 *
 */
@Data
@AllArgsConstructor
public class ClientDto {

    private Integer id;

    private String name;

    private String email;

    private String phone;

    private Address address;

    public ClientDto(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
}
