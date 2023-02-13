package com.example.hw27b.dto;

import com.example.hw27b.model.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/*
 *
 * @author Roman Netesa
 *
 */
@Data
@AllArgsConstructor
@Slf4j
public class ClientOrderDto {
    private Integer id;
    private String name;
    private String email;
    private String phone;
    private List<Order> orders;

    public void showInfo(){
        log.info(id + "\n" + name + "\n" + email + "\n"
                + phone + "\n" + orders);
    }
}
