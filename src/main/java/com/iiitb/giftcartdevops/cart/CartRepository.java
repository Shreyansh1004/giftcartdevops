package com.iiitb.giftcartdevops.cart;

import org.springframework.data.repository.CrudRepository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface CartRepository extends CrudRepository<Cart,Integer> {

     public List<Cart> findByCustomerId(Integer id);

}
