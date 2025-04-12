package com.ggduck.customerservice.services;

import com.ggduck.customerservice.entities.Customer;

public interface CustomerService {
    Customer save(Customer customer);
    Customer findById(long id);
}

