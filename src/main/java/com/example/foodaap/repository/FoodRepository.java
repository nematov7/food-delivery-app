package com.example.foodaap.repository;

import com.example.foodaap.entety.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food , String > {
}
