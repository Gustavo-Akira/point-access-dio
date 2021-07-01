package br.com.gustavoakira.point.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tb_user")
@Audited
public class User {
    @Id
    private Long id;
    @ManyToOne
    private UserCategory category;
    private String name;
    @ManyToOne
    private Company company;
    @ManyToOne
    private AccessLevel level;
    @ManyToOne
    private WorkHours hours;
    private BigDecimal tolerance;
    private LocalDateTime startHour;
    private LocalDateTime endHour;
}
