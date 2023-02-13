package com.example.hw27b;

import com.example.hw27b.dto.AddressDto;
import com.example.hw27b.dto.ClientDto;
import com.example.hw27b.dto.ProductDto;
import com.example.hw27b.model.Address;
import com.example.hw27b.service.ClientService;
import com.example.hw27b.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class Hw27BApplication {

    @Autowired
    private ClientService clientService;

    @Autowired
    private OrderService orderService;

    public static void main(String[] args) {
        SpringApplication.run(Hw27BApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void started(){
        clientService.createNewClient(
                new ClientDto("Petro", "mail@mail.com", "+380661112233"),
                new AddressDto("Ukraine", "Kharkiv", "Svobody", "12a"));

        orderService.addNewProduct(new ProductDto("Banana", "Yellow", 15.5d));
        orderService.addNewProduct(new ProductDto("Apple", "Red", 15.3d));
        orderService.addNewProduct(new ProductDto("Apple", "Green", 13.5d));
        orderService.addNewProduct(new ProductDto("Beer", "Filtered", 30.5d));

        orderService.createNewOrder(3);
        orderService.addOrderItem(1, 2, 4);

        clientService.getClient(3).showInfo();
        clientService.getClientOrderId(3).showInfo();
        clientService.getClientOrder(3).showInfo();

    }

}
