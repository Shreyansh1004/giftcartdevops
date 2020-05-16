package com.iiitb.giftcartdevops.address;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public List<Address> getAllAddress(Integer customer_id)
    {
        List<Address> addresses = new ArrayList<>();
        addressRepository.findByCustomerId(customer_id).forEach(addresses::add);
         return addresses;
    }
    public Optional<Address> getAddress(Integer id)
    {
        return addressRepository.findById(id);
    }
    public void addAddress(Address address)
    {
        addressRepository.save(address);
    }
    public void updatAddress(Address address)
    {
        addressRepository.save(address);
    }
    public void deleteAddress(Integer id){
        addressRepository.deleteById(id);
    }

}
