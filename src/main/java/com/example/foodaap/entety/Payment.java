package com.example.foodaap.entety;

import com.example.foodaap.entety.enums.PayType;
import com.example.foodaap.entety.template.AbsEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.OneToOne;



@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity(name = "payments")
public class Payment extends AbsEntity {
    @OneToOne
    Order orders;

    PayType payType;

    double totalAmount;
}
