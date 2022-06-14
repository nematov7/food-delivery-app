package com.example.foodaap.entety;

import com.example.foodaap.entety.template.AbsEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
    @Entity(name = "deliveryPrices")
public class DeliveryPricing extends AbsEntity {
    double initialDeliveryPrice;
    double deliveryPricePerKm;
}
