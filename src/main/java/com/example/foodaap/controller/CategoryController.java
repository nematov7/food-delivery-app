package com.example.foodaap.controller;

import com.example.foodaap.entety.Category;
import com.example.foodaap.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {
   @Autowired
   CategoryService categoryService;

   public Category getCategoryId(String categoryId){
      return categoryService.getCategoryId(categoryId);
   }

}
