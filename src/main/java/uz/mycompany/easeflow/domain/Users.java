package uz.mycompany.easeflow.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.mycompany.easeflow.domain.base.AbstractAuditingEntity;

import java.io.Serializable;

/**
 * Powered by: Shukhratjon Rayimjonov
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "users")
public class Users extends AbstractAuditingEntity implements Serializable {
}
