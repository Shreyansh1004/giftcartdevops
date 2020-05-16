package com.iiitb.giftcartdevops.product;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    private String id;
    private String name;
    private String price;
    private String description;
    private String thumbnail;
    private String image;
    private String numItems;



    public Product() {

    }

    public Product(String id, String name, String price, String description, String thumbnail, String image, String numItems) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.thumbnail = thumbnail;
        this.image = image;
        this.numItems = numItems;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNumItems() {
        return numItems;
    }

    public void setNumItems(String numItems) {
        this.numItems = numItems;
    }



}
