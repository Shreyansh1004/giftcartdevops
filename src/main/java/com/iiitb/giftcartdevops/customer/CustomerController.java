package com.iiitb.giftcartdevops.customer;

import com.iiitb.giftcartdevops.address.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(method = RequestMethod.POST, value = "/home/{email}/{password}")
    public String getCustomerByEmail(@PathVariable String email,@PathVariable String password) {
        Customer customer = customerService.getCustomerByEmail(email);
        if(customer!=null) {
            if (customer.password.compareTo(password) == 0)
                return "True";
            else
                return "False";
        }
        else
            return "False";
    }

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
