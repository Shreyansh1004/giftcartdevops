package com.iiitb.giftcartdevops.address;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AddressRepository extends CrudRepository<Address,Integer> {

     public List<Address> findByCustomerId(Integer id);

}
