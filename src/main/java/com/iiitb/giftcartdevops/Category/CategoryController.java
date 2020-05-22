package com.iiitb.giftcartdevops.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

  @RequestMapping("/categories")
  public List<Category> getAllCategories(){
      return categoryService.getAllCategories();
  }

  @RequestMapping("/categories/{category_id}")
  public Optional<Category> getCategories(@PathVariable Integer category_id){
      return categoryService.getCategory(category_id);
  }

  @RequestMapping(method = RequestMethod.POST,value = "/categories")
  public void addCategories(@RequestBody Category category){
      categoryService.addCategory(category);
  }


    @RequestMapping(method = RequestMethod.PUT,value = "/categories/{category_id}")
    public void updateCategories(@RequestBody Category category, @PathVariable Integer category_id){
        categoryService.updateCategory(category_id,category);
    }


    @RequestMapping(method = RequestMethod.DELETE,value = "/categories/{category_id}")
    public void deleteCategories(@PathVariable Integer category_id){
        categoryService.deleteCategory(category_id);
    }
}
