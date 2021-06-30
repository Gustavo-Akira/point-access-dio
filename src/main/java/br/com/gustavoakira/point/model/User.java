package br.com.gustavoakira.point.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
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
