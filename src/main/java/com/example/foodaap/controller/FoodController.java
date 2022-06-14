package com.example.foodaap.controller;

import com.example.foodaap.dto.FoodDto;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodController {
    @PostMapping
    public HttpEntity<?> createFood(@RequestBody FoodDto foodDb){

    }
}
