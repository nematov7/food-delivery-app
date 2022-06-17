package com.example.foodaap.service;

import com.example.foodaap.entety.Category;
import com.example.foodaap.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public Category getCategoryId(String categoryId) {
        try {
         return   categoryRepository.getReferenceById(categoryId);
        }catch (Exception e){
            return null;
        }
    }
}
