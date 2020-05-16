package com.iiitb.giftcartdevops.customer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomer()
    {
        List<Customer> customers = new ArrayList<>();
        customerRepository.findAll().forEach(customers::add);
        return customers;
    }
    public Optional<Customer> getCustomer(Integer id)
    {
        return customerRepository.findById(id);
    }
    public void addCustomer(Customer customer)
    {
        customerRepository.save(customer);
    }
    public void updateCustomer(Integer id,Customer customer)
    {
        customerRepository.save(customer);
    }
    public void deleteCustomer(Integer id){
        customerRepository.deleteById(id);
    }


}
