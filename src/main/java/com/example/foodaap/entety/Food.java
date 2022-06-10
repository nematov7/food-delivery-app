package com.example.foodaap.entety;

import com.example.foodaap.entety.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.PackagePrivate;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@PackagePrivate
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Food extends AbsEntity {
    String name;
    String description;
    double price;
    UUID imageId;
    boolean isAvailable;
    LocalDateTime availableFrom;
    LocalDateTime availableTo;
    @ManyToOne
    LanguageCategory languageCategory;
    int preparationTimeInMin;

}
