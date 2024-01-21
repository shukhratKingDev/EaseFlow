package uz.mycompany.easeflow.domain.base;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.apache.catalina.User;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Powered by: Shukhratjon Rayimjonov
 * Date: 21.01.2024
 */
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class AbstractAuditingEntity extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 3L;

    @CreatedBy
    @Column(name = "creator_id")
    Long creatorId;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @Column(name = "creator_id", insertable = false, updatable = false)
    User creator;

    @CreatedDate
    @Column(name = "created_date")
    LocalDateTime createdDate;

    @LastModifiedBy
    @Column(name = "updater_id")
    Long updaterId;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @Column(name = "updater_id", insertable = false, updatable = false)
    User updater;

    @LastModifiedDate
    @Column(name = "created_date")
    LocalDateTime updatedDate;
}
