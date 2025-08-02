package com.example.NTG_task1.Repositories;

import com.example.NTG_task1.Models.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Repository
public class CustomerRepo {

    private final List<Customer> customers = new ArrayList<>();
    private final AtomicLong idGenerator = new AtomicLong(1);

    public List<Customer> getAll() {
        return customers;
    }

    public Optional<Customer> getById(Long id) {
        return customers.stream().filter(c -> c.getId().equals(id)).findFirst();
    }

    public Customer save(Customer customer) {
        customer.setId(idGenerator.getAndIncrement());
        customers.add(customer);
        return customer;
    }

    public Customer update(Long id, Customer updated) {
        Optional<Customer> found = getById(id);
        if (found.isPresent()) {
            Customer customer = found.get();
            customer.setName(updated.getName());
            customer.setEmail(updated.getEmail());
            return customer;
        }
        throw new RuntimeException("Customer not found");
    }

    public void delete(Long id) {
        customers.removeIf(c -> c.getId().equals(id));
    }

    public List<Customer> findByName(String name) {
        return customers.stream()
                .filter(c -> c.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }

}
