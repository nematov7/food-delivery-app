package com.example.foodaap.entety;

import com.example.foodaap.entety.template.AbsEntity;
import lombok.*;
import lombok.experimental.PackagePrivate;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalTime;


@PackagePrivate
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "foods")
public class Food extends AbsEntity {
    String name;
    String description;
    double price;
    String  imageId;
    boolean isAvailable;
    LocalTime availableFrom;
    LocalTime availableTo;
    @ManyToOne
    Category category;
    int preparationTimeInMin;

}
