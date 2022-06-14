package com.example.foodaap.entety;

import com.example.foodaap.entety.template.AbsEntity;
import lombok.*;
import lombok.experimental.PackagePrivate;

import javax.persistence.Entity;
@Entity(name = "districts")
@PackagePrivate
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class District extends AbsEntity {
    String name;
}
