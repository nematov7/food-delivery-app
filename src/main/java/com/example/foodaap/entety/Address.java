package com.example.foodaap.entety;

import com.example.foodaap.entety.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.PackagePrivate;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@PackagePrivate
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Address extends AbsEntity {
    @ManyToOne
    User user;
    String name;
    @ManyToOne
    Districts districts;
    String landmark; //taxminiy joy
    int houseNumber;  //nichinchi domligi
    int entrance; //padiz
    int flat; // uy nomeri
    int floor;//qavat
    float latitude;
    float longitude;

}
