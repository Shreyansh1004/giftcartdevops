package com.iiitb.giftcartdevops.cart;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    public List<Cart> getAllProducts(Integer customer_id)
    {
        List<Cart> carts = new ArrayList<>();
        cartRepository.findByCustomerId(customer_id).forEach(carts::add);
         return carts;
    }
    //@Query("SELECT c  from cart c where c.customer_id=customer_id and c.product_product_id=product_id")
    public void addProduct(Cart cart)
    {
        cartRepository.save(cart);
    }
    //public void updatAddress(Cart cart)
        //cartRepository.save(cart);
    //public void deleteAddress(Integer id){
        //cartRepository.deleteById(id);

}
