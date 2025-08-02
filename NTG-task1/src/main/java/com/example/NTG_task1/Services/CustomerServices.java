package com.example.NTG_task1.Services;

import com.example.NTG_task1.Models.Customer;
import com.example.NTG_task1.Repositories.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServices {

    @Autowired
    private CustomerRepo customerRepo;

    public List<Customer> getAllCustomers() {
        return customerRepo.getAll();
    }

    public Optional<Customer> getCustomerById(Long id) {
        return customerRepo.getById(id);
    }

    public Customer addCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

    public Customer updateCustomer(Long id, Customer customerDetails) {
        return customerRepo.update(id, customerDetails);
    }

    public void deleteCustomer(Long id) {
        customerRepo.delete(id);
    }

    public List<Customer> filterByName(String name) {
        return customerRepo.findByName(name);
    }
}
