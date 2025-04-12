package com.ggduck.orderservice.controllers;

import com.ggduck.orderservice.entities.Order;
import com.ggduck.orderservice.services.OrderService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class OrderController {
    OrderService orderService;
    RestTemplate restTemplate;

    @PostMapping
    public Order create(@RequestBody Order order) {

        Object object= restTemplate.getForObject("http://product-service/products/" + order.getProductId(), Object.class);
        System.out.println("Product ID: " + order.getProductId());
        System.out.println("Product Details: " + object);
        return orderService.save(order);
    }

    @GetMapping
    public Order get(@RequestParam long id) {
        return orderService.findById(id);
    }
}
