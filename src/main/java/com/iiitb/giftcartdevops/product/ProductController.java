package com.iiitb.giftcartdevops.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

  @RequestMapping("/products")
  public List<Product> getAllProducts(){
      return productService.getAllProducts();
  }

  @RequestMapping("/products/{id}")
  public Optional<Product> getProduct(@PathVariable String id){
      return productService.getProduct(id);
  }

  @RequestMapping(method = RequestMethod.POST,value = "/products")
  public void addProduct(@RequestBody Product product){
      productService.addProduct(product);
  }


    @RequestMapping(method = RequestMethod.PUT,value = "/products/{id}")
    public void updateProduct(@RequestBody Product product,@PathVariable String id){
        productService.updateProduct(id,product);
    }


    @RequestMapping(method = RequestMethod.DELETE,value = "/products/{id}")
    public void deleteProduct(@PathVariable String id){
        productService.deleteProduct(id);
    }
}
