package com.iiitb.giftcartdevops.address;


//import com.project.giftkart.customer.Customer;
import com.iiitb.giftcartdevops.customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @RequestMapping("/customer/{customer_id}/address")
    public List<Address> getAddress(@PathVariable Integer customer_id) {
        return addressService.getAllAddress(customer_id);
    }

    @RequestMapping("/customer/{customer_id}/address/{id}")
    public Optional<Address> getAddressbyId(@PathVariable Integer id){
        return addressService.getAddress(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/customer/{customer_id}/address")
        public void addAddressByID(@RequestBody Address address,@PathVariable  Integer customer_id)
        {
            address.setCustomer(new Customer(customer_id,"","","",0));
            addressService.addAddress(address);
        }

    @RequestMapping(method = RequestMethod.PUT, value = "/customer/{customer_id}/address/{id}")
    public void updateAddressByID(@RequestBody Address address, @PathVariable Integer id, @PathVariable Integer customer_id)
    {
        address.setCustomer(new Customer(customer_id,"","","",0));
        addressService.updatAddress(address);
    }


    @RequestMapping(method = RequestMethod.DELETE, value = "/customer/{customer_id}/address/{id}")
    public void deleteAddressByID(@PathVariable Integer id)
    {
        addressService.deleteAddress(id);
    }
}
