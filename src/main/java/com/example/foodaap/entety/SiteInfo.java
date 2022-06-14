package com.example.foodaap.entety;

import com.example.foodaap.entety.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.PackagePrivate;

import javax.persistence.Entity;

@PackagePrivate
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "siteInfos")
public class SiteInfo extends AbsEntity {
    String address;
    String phoneNumber;
    float latitude;
    float longitude;
}
