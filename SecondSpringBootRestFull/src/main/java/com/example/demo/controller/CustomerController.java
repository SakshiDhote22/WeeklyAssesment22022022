package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.CustomerRepo;
import com.example.demo.model.Customer;

@RestController
public class CustomerController {

	@Autowired

	CustomerRepo repo;
	
	
//	Insert record

	@PostMapping(path = "/customer", consumes = { "application/json" })

	public Customer addCustomer(@RequestBody Customer customer)

	{

		repo.save(customer);

		return customer;

	}
	
//	Get all records

	@GetMapping("/customers")

	public List<Customer> getCustomers()

	{

		return repo.findAll();

	}

	
//	Get 1 record 
	
	@GetMapping("/customer/{customerid}")

	public Optional<Customer> getCustomer(@PathVariable("customerid") int customerid)

	{

		return repo.findById(customerid);

	}
	
	
//	Delete Record

	@DeleteMapping("/customer/{customerid}")

	public String deleteCustomer(@PathVariable int customerid)

	{

		Customer a = repo.getOne(customerid);

		repo.delete(a);

		return "deleted";

	}

	
//	Update record
	
	@PutMapping(path = "/customer", consumes = { "application/json" })

	public Customer saveOrUpdateCustomer(@RequestBody Customer customer)

	{

		repo.save(customer);

		return customer;

	}

}
