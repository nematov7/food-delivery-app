package com.example.foodaap.entety;
import com.example.foodaap.entety.template.AbsEntity;
import lombok.*;
import lombok.experimental.PackagePrivate;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@PackagePrivate
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "users")
public class User extends AbsEntity {
    String fullName;

    String phoneNumber;

    @ManyToMany
    Set<Role> role = new HashSet<>();

    boolean isBlocked;
}
