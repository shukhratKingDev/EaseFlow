package uz.mycompany.easeflow.domain.base;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.io.Serial;
import java.io.Serializable;

/**
 * Powered by: Shukhratjon Rayimjonov
 * Date: 21.01.2024
 */
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PROTECTED)
public class SimpleEntity extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 2L;

    @Column(name = "deleted")
    boolean deleted = false;
}
