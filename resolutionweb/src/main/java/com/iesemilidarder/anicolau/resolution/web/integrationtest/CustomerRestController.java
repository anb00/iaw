package com.iesemilidarder.anicolau.resolution.web.integrationtest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerRestController {

	@Autowired
	CustomerData customers;
	
    @RequestMapping("/customer/api/list")
    public List<Customer> list() {	
        return customers.getCustomers();
    }
    
    @PostMapping("/customer/api/new")
    public Customer add(@RequestBody Customer customer) {
    	customers.getCustomers().add(customer);
        return customer;
    }
}