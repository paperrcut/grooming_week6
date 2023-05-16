package com.practice.week6.CustomerRegistration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/save")
    public ResponseEntity<String> saveCustomer(@RequestBody Customer customer){
        return ResponseEntity.ok().body(customerService.saveCustomer(customer));
    }

    @PostMapping("/saveAll")
    public ResponseEntity<String> saveCustomer(@RequestBody List<Customer> customer){
        return ResponseEntity.ok().body(customerService.saveAllCustomers(customer));
    }

    @GetMapping("/get")
    public ResponseEntity<List<Customer>> getCustomer(@RequestParam(name="name")String name){
        return new ResponseEntity<>(customerService.findCustomerByName(name), HttpStatus.OK);
    }
}
