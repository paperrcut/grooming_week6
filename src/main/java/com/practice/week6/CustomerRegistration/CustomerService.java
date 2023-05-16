package com.practice.week6.CustomerRegistration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public String saveCustomer(Customer customer){
        Customer temp = customerRepository.save(customer);
        if(temp.getId()==customer.getId())
            return "Customer Added";
        else
            return "Error in adding Customer";
    }

    public String saveAllCustomer(List<Customer> customers){
        List<Customer> temp = customerRepository.saveAll(customers);
        if(temp.size()==customers.size())
            return "Customer Added";
        else
            return "Error in adding Customer";
    }

    public List<Customer> findCustomerByName(String name){
        return customerRepository.findByName(name);
    }
}
