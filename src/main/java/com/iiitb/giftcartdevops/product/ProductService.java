package com.iiitb.giftcartdevops.product;

import com.iiitb.giftcartdevops.address.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;



    public List<Product> getAllProducts(String category_id){
        List<Product> products =new ArrayList<>();
         productRepository.findByCategoryId(category_id).forEach(products::add);
         return products;
    }

    public Optional<Product> getProduct(String id){
        return productRepository.findById(id);
    }

    public void addProduct(Product product){
        productRepository.save(product);
    }

    public void updateProduct(String id, Product product) {
       productRepository.save(product);
    }


    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }





}
