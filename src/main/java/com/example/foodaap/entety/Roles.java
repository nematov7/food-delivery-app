package com.example.foodaap.entety;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.PackagePrivate;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
@PackagePrivate
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Roles extends AbsEntity {
    String name;

    @ManyToMany
    Set<Roles> roles = new HashSet<>();
}
