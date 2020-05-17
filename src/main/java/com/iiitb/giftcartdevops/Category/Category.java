package com.iiitb.giftcartdevops.Category;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Category {

    @Id
    private String id;
    private String name;
    private String description;



    public Category() {

    }

    public Category(String id,String name,String description) {
    super();
    this.id=id;
    this.name=name;
    this.description=description;
    }



    public String getCategory_id() {
        return id;
    }

    public void setCategory_id(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
