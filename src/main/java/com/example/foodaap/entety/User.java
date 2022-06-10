package com.example.foodaap.entety;
import com.example.foodaap.entety.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.PackagePrivate;
import javax.persistence.Entity;

@Entity
@PackagePrivate
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User extends AbsEntity {
    String fullName;
    String phoneNumber;
    boolean isBlocked;
}
