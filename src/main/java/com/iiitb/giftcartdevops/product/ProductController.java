package com.iiitb.giftcartdevops.product;

import com.iiitb.giftcartdevops.Category.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    //testing the commit


    @Autowired
    private ProductService productService;

    @RequestMapping("/products")
    public List<Product> getCompleteProductList(){
        return productService.getCompleteProducts();
    }

  @RequestMapping("/categories/{category_id}/products")
  public List<Product> getAllProducts(@PathVariable String category_id){
      return productService.getAllProducts(category_id);
  }

  @RequestMapping("/categories/{category_id}/products/{id}")
  public Optional<Product> getProduct(@PathVariable String id){
      return productService.getProduct(id);
  }

  @RequestMapping(method = RequestMethod.POST,value = "/categories/{category_id}/products")
  public void addProduct(@RequestBody Product product,@PathVariable String category_id){
      product.setCategory(new Category(category_id,"",""));
      productService.addProduct(product);
  }


    @RequestMapping(method = RequestMethod.PUT,value = "/categories/{category_id}/products/{id}")
    public void updateProduct(@RequestBody Product product,@PathVariable String category_id,@PathVariable String id){
        product.setCategory(new Category(category_id,"",""));
        productService.updateProduct(id,product);
    }


    @RequestMapping(method = RequestMethod.DELETE,value = "/categories/{category_id}/products/{id}")
    public void deleteProduct(@PathVariable String id){
        productService.deleteProduct(id);
    }
}
