package com.example.hw27b.service;

import com.example.hw27b.dto.OrderDto;
import com.example.hw27b.dto.ProductDto;
import com.example.hw27b.model.Client;
import com.example.hw27b.model.Order;
import com.example.hw27b.model.OrderItem;
import com.example.hw27b.model.Product;
import com.example.hw27b.repository.ClientRepository;
import com.example.hw27b.repository.OrderItemRepository;
import com.example.hw27b.repository.OrderRepository;
import com.example.hw27b.repository.ProductRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/*
 *
 * @author Roman Netesa
 *
 */
@Service
@RequiredArgsConstructor
public class OrderService {
    private final ProductRepository productRepository;
    private final OrderRepository orderRepository;
    private final OrderItemRepository orderItemRepository;
    private final ClientRepository clientRepository;

    public ProductDto addNewProduct(ProductDto productDto){
        Product product = new Product();
        product.setName(productDto.getName());
        product.setDescription(productDto.getDescription());
        product.setPrice(productDto.getPrice());
        productRepository.save(product);
        productDto.setId(product.getId());
        return productDto;
    }

    public OrderDto createNewOrder(Integer clientId){
        Client client = clientRepository.findById(clientId).orElseThrow(()-> new EntityNotFoundException("No client!"));
        Order order = new Order();
        List<OrderItem> orderItems = new ArrayList<>();

        order.setClient(client);
        order.setOrderItems(orderItems);
        orderRepository.save(order);

        OrderDto orderDto = new OrderDto();
        orderDto.setOrderItems(order.getOrderItems());
        orderDto.setClient(order.getClient());
        orderDto.setId(order.getId());

        return orderDto;
    }

    public void addOrderItem(Integer orderId, Integer productId, Integer count){
        Order order = orderRepository.findById(orderId)
                .orElseThrow(()-> new EntityNotFoundException("No order!"));

        Product product = productRepository.findById(productId)
                .orElseThrow(()-> new EntityNotFoundException("No product!"));

        OrderItem orderItem = new OrderItem();
        orderItem.setOrder(order);
        orderItem.setProduct(product);
        orderItem.setCount(count);

        orderItemRepository.save(orderItem);


    }
}
