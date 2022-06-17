package com.example.foodaap.service;

import com.example.foodaap.dto.FoodDto;
import com.example.foodaap.entety.Category;
import com.example.foodaap.entety.Food;
import com.example.foodaap.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {
@Autowired
FoodRepository foodRepository;
@Autowired
CategoryService categoryService;


    public ResponseEntity<?> createFood(FoodDto foodDto) {
        Food food=new Food();
        try {
                food.setIsAvailable(foodDto.getIsAvailable());
                food.setAvailableFrom(foodDto.getAvailableFrom());
                food.setAvailableTo(foodDto.getAvailableTo());

                Category categoryId = categoryService.getCategoryId(foodDto.getCategoryId());
                System.out.println(categoryId.toString());

                // TODO: 14.06.2022 categoriyadan davom etamiz
                food.setCategory(categoryId);
                food.setDescription(foodDto.getDescription());
                food.setImageId(foodDto.getImageId());
                food.setName(foodDto.getName());
                food.setPrice(foodDto.getPrice());
                food.setPreparationTimeInMin(foodDto.getPreparationTimeInMin());

            Food save = foodRepository.save(food);
            System.out.println(save.toString()  );


            return new ResponseEntity<>("hammasi joyida", HttpStatus.OK );
        }catch (Exception e){
            return new ResponseEntity<>( "hammsi dabdala", HttpStatus.BAD_REQUEST );
        }
    }

    public ResponseEntity<?> getAllFood() {
        List<Food> all = foodRepository.findAll();
        if (!all.isEmpty()) {
            return new ResponseEntity<>(all, HttpStatus.OK );
        }
        return new ResponseEntity<>( "WRONG", HttpStatus.BAD_REQUEST );
    }

    public ResponseEntity<?> getByIdFood(String id) {
        try {
        Food referenceById = foodRepository.getReferenceById(id);
            return new ResponseEntity<>(referenceById, HttpStatus.OK );
        }catch (Exception e){

        return new ResponseEntity<>("WRONG", HttpStatus.OK );
        }
    }

    public ResponseEntity<?> updateBiIdFood(String id, FoodDto foodDto) {
        // TODO: 17.06.2022             ResponseEntity<?> byIdFood = getByIdFood(id); clasga ugirish
        try {
            Food food = foodRepository.getReferenceById(id);


            food.setIsAvailable(foodDto.getIsAvailable());
            food.setAvailableFrom(foodDto.getAvailableFrom());
            food.setAvailableTo(foodDto.getAvailableTo());
            Category categoryId = categoryService.getCategoryId(foodDto.getCategoryId());
            System.out.println(categoryId.toString());

            // TODO: 14.06.2022 categoriyadan davom etamiz
            food.setCategory(categoryId);
            food.setDescription(foodDto.getDescription());
            food.setImageId(foodDto.getImageId());
            food.setName(foodDto.getName());
            food.setPrice(foodDto.getPrice());
            food.setPreparationTimeInMin(foodDto.getPreparationTimeInMin());

            foodRepository.save(food);
            return new ResponseEntity<>(food, HttpStatus.OK );

        }catch (Exception e){
            return new ResponseEntity<>("WRONG", HttpStatus.BAD_REQUEST);
        }
    }
}

