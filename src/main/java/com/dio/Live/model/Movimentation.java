package com.dio.Live.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
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
public class Movimentation {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable 
    public class MovimentationId implements Serializable {
        private long idMovimentation;
        private long idUser;
    }

    @EmbeddedId
    private MovimentationId id; // O id da movimentação vai ter 2 ids(movimentação e user)
    private LocalDateTime entrada;
    private LocalDateTime saida;
    private BigDecimal permanencia;
    private Ocurrency ocurrency;
    private Calendar calendar;

}
