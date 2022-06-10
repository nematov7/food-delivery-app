package com.example.foodaap.entety;

import com.example.foodaap.entety.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.PackagePrivate;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
@PackagePrivate
@AllArgsConstructor
@NoArgsConstructor
@Data
public class VerificationCodes extends AbsEntity {
    String phoneNumber;
    int code;
    LocalDateTime createdAt;
    LocalDateTime expireAt;
}
