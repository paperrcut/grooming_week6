package com.practice.week6.CustomerRegistration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public String saveCustomer(Customer customer){
        customerRepository.save(customer);
        return "Customer Added";

    }

    public String saveAllCustomers(List<Customer> customers){
        customerRepository.saveAll(customers);
        return "Customers Added";

    }

    public List<Customer> findCustomerByName(String name){
        return customerRepository.findByName(name);
    }
}
