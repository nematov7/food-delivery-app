package com.example.foodaap.entety;

import com.example.foodaap.entety.template.AbsEntity;
import lombok.*;
import lombok.experimental.PackagePrivate;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity(name = "addresses")
@PackagePrivate
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Address extends AbsEntity {
    @ManyToOne
    User user;
    String name;
    @ManyToOne
    District districts;
    String landmark; //taxminiy joy
    int houseNumber;  //nichinchi domligi
    int entrance; //padiz
    int flat; // uy nomeri
    int floor;//qavat
    double latitude;
    float longitude;

}
