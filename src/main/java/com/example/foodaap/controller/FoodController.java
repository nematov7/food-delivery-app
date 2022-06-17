package com.example.foodaap.controller;

import com.example.foodaap.dto.FoodDto;
import com.example.foodaap.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/food")
public class FoodController {

    @Autowired
    FoodService foodService;

    @PostMapping
    public ResponseEntity<?> createFood(@RequestBody FoodDto foodDto) {
    return foodService.createFood(foodDto);
    }


    @GetMapping
    public ResponseEntity<?> getAllFood(){
        return foodService.getAllFood() ;
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateBiIdFood(@RequestBody FoodDto foodDto,@PathVariable String id){
     return foodService.updateBiIdFood(id,foodDto) ;
    }

    @GetMapping("/byId/{id}")
    public ResponseEntity<?> getBiIdFood(@PathVariable String id){
        return foodService.getByIdFood(id);
    }

}
