package com.example.NTG_task1.Controllers;

import com.example.NTG_task1.Models.Customer;
import com.example.NTG_task1.Services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerServices customerServices;

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerServices.getAllCustomers();
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return customerServices.getCustomerById(id).orElseThrow(() -> new RuntimeException("Customer not found"));
    }

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerServices.addCustomer(customer);
    }

    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
        return customerServices.updateCustomer(id, customer);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        customerServices.deleteCustomer(id);
    }

    @GetMapping("/filter")
    public List<Customer> filterCustomers(@RequestParam String name) {
        return customerServices.filterByName(name);
    }
}
