package com.example.foodaap.entety;

import com.example.foodaap.entety.template.AbsEntity;
import lombok.*;
import lombok.experimental.PackagePrivate;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity(name = "verificationCodes")
@PackagePrivate
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class VerificationCode extends AbsEntity {
    String phoneNumber;

    Integer code;

    LocalDateTime expireAt;
}
