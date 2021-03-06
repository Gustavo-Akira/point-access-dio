package br.com.gustavoakira.point.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Movimentation {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Embeddable
    class MovimentationId implements Serializable {
        private Long idMovimento;
        private Long idUser;
    }

    @EmbeddedId
    private MovimentationId id;

    private LocalDateTime entryDate;
    private LocalDateTime exitDate;

    private BigDecimal period;
    @ManyToOne
    private Occurrence occurrence;
    @ManyToOne
    private Calendar calendar;
}
