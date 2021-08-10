package com.dio.Live.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class HoursBase {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class HoursBaseId implements Serializable {
        private long idHoursBase;
        private long idMovimentation;
        private long idUser;
    }

    @EmbeddedId
    private HoursBaseId id;
    private LocalDateTime workedDate;
    private BigDecimal quantityHours;
    private BigDecimal saldoHorasTrabalho;

}
