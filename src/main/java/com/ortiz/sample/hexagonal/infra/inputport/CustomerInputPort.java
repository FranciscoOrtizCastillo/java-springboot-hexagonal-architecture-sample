package com.ortiz.sample.hexagonal.infra.inputport;

import java.util.List;

import com.ortiz.sample.hexagonal.domain.Customer;

public interface CustomerInputPort {

    public Customer createCustomer(String name, String country);

    public Customer getById(String customerId);

    public List<Customer> getAll();
    
}
