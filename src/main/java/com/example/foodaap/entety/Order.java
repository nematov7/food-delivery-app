package com.example.foodaap.entety;

import com.example.foodaap.entety.enums.OrderStatus;
import com.example.foodaap.entety.template.AbsEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity(name = "orders")
public class Order extends AbsEntity {

    @ManyToOne
    User user;

    @ManyToOne
    User deliverer;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer orderNumber;

    int estimatedTime;

    OrderStatus status;

    double totalSum;

    @OneToOne
    Address address;

    double deliveryPrice;
}
