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
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String email;

    private String phone;

    @OneToOne(mappedBy = "client")
    private Address address;
    @OneToMany(mappedBy = "client", fetch = FetchType.EAGER)
    private List<Order> orders;
}
