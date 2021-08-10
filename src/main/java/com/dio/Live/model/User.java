package com.dio.Live.model;

import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDate;

public class User {


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
