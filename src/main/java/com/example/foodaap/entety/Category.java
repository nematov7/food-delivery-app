package com.example.foodaap.entety;

import com.example.foodaap.entety.template.AbsEntity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "categories")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Category extends AbsEntity {

    String nameUz;

    String nameRu;

    String nameEn;

    String descriptionUz;

    String descriptionEn;

    String descriptionRu;
}
