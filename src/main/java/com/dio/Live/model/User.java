package com.dio.Live.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class User {

    @Id
    private long id;

    @ManyToOne //Várias usuários tem uma categoria
    private UserCategory userCategory;


    private String nome;

    @ManyToOne
    private Corporation corporation;

    @ManyToOne
    private AcessLevel acessLevel;

    @ManyToOne
    private WorkJourney workJourney;
    private BigDecimal tolerancia;
    private LocalDate inicioJornada;
    private LocalDate finalJornada;

}
