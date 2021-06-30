package br.com.gustavoakira.point.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class HoursBank {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Embeddable
    class HoursBankId implements Serializable{
        private Long idHourBank;
        private Long idMovimentation;
        private Long idUser;
    }

    @EmbeddedId
    private HoursBankId id;

    private LocalDateTime workedDate;
    private BigDecimal hourQuantity;
    private  BigDecimal hourBalance;
}
