package com.example.foodaap.dto;

import com.example.foodaap.entety.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class FoodDto {

    String name;

    String description;

    double price;

    String  imageId;

    Boolean isAvailable;

    LocalTime availableFrom;

    LocalTime availableTo;

    String  categoryId;

    int preparationTimeInMin;
}
