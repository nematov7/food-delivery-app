package com.example.foodaap.entety.template;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.UUID;


@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class AbsEntity {
    @Id
    private String  id = UUID.randomUUID().toString();
    @OrderBy
    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(nullable = false)
    private LocalDateTime updatedAt;

    @CreatedBy
    @Column(name = "created_by_id")
    private String createdBy;

    @LastModifiedBy
    @Column(name = "updated_by_id")
    private String updatedBy;

}
