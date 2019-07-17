package com.codegym.cms.service;

import com.codegym.cms.model.Customer;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    Customer findById(PathVariable id);

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);
}