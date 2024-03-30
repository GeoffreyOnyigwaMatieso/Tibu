package com.tibuhealth.Tibu.service;

import com.tibuhealth.Tibu.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Customer {

    @Autowired
    private CustomerRepository customerRepository;


    //create a meethod that returns a list of Customer
    List<Customer> customers = new ArrayList<>();





}
