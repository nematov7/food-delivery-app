package com.example.foodaap.entety;

import com.example.foodaap.entety.template.AbsEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity(name = "orderItems")
public class OrderItem extends AbsEntity {
    @ManyToOne
    Food food;

    int quantity;

    @ManyToOne
    Order order;
}
