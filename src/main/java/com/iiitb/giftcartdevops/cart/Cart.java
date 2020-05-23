package com.iiitb.giftcartdevops.cart;

import com.iiitb.giftcartdevops.customer.Customer;
import com.iiitb.giftcartdevops.product.Product;

import javax.persistence.*;
import java.util.Date;

//import com.project.giftkart.customer.Customer;

@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @ManyToOne
    //@Column(columnDefinition = "cid")
    private Customer customer;

    @ManyToOne
    //@Column(columnDefinition = "pid")
    private Product product;


    Integer amount;
    Date date;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Cart() {
    }


    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }





}
