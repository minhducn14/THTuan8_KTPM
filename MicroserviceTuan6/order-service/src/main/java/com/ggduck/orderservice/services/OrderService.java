package com.ggduck.orderservice.services;

import com.ggduck.orderservice.entities.Order;

public interface OrderService {
    Order save(Order order);
    Order findById(long id);
}
