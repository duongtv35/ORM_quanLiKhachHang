package com.codegym.cms.service;

import com.codegym.cms.model.Customer;
import com.codegym.cms.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class CustomerServiecImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(PathVariable id) {
        return null;
    }


    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerRepository.remove(id);
    }
}
