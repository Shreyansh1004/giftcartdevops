package com.iiitb.giftcartdevops.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/customer")
    public List<Customer> getCustomer() {
        return customerService.getAllCustomer();
    }

    @RequestMapping("/customer/{id}")
    public Optional<Customer> getCustomerbyId(@PathVariable Integer id){
        return customerService.getCustomer(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/customer")
        public void addCustomerByID(@RequestBody Customer customer)
        {
            customerService.addCustomer(customer);
        }

    @RequestMapping(method = RequestMethod.PUT, value = "/customer/{id}")
    public void updateCustomerByID(@RequestBody Customer customer, @PathVariable Integer id)
    {
        customerService.updateCustomer(id,customer);
    }


    @RequestMapping(method = RequestMethod.DELETE, value = "/customer/{id}")
    public void deleteCustomerByID(@PathVariable Integer id)
    {
        customerService.deleteCustomer(id);
    }
}