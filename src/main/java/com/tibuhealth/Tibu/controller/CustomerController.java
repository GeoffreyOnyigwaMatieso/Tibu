package com.tibuhealth.Tibu.controller;

import com.tibuhealth.Tibu.model.Customer;
import com.tibuhealth.Tibu.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired  //declares this as a dependency
    private CustomerService customerService;


    @RequestMapping("/api/v1/customers")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @PostMapping("/api/v1/customers")

    public Customer addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);

    }


}
