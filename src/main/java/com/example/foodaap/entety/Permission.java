package com.example.foodaap.entety;

import com.example.foodaap.entety.template.AbsEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "permissions")
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Permission extends AbsEntity {
    String name;
}
