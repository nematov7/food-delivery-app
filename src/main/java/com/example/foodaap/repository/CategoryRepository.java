package com.example.foodaap.repository;

import com.example.foodaap.entety.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,String > {
}
