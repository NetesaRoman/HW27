package com.example.hw27b.dto;

import com.example.hw27b.model.Client;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/*
 *
 * @author Roman Netesa
 *
 */
@Data
@AllArgsConstructor
@Slf4j
public class ClientInfoDto {
    private Integer id;

    private String name;
    private String email;
    private String phone;
    private String country;
    private String city;
    private String street;
    private String house;

    public void showInfo(){
        log.info(id + "\n" + name + "\n" + email + "\n"
                + phone + "\n" + country+ "\n" + city +
                "\n" + street + "\n" + house);
    }

}
