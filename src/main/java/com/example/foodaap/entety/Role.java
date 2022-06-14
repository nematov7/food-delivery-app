package com.example.foodaap.entety;

import com.example.foodaap.entety.enums.RoleEnum;
import com.example.foodaap.entety.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.PackagePrivate;

import javax.persistence.Entity;
import javax.persistence.Transient;

@PackagePrivate
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "roles")
public class Role extends AbsEntity {
    String name;

    RoleEnum role;
}
