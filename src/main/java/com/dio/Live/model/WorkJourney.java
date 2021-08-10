package com.dio.Live.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor //Faz a construção do método da classe com as propriedades como parâmetros
@NoArgsConstructor // Construtor sem argumentos
@EqualsAndHashCode
@Builder // Faz a transferência de um dto(data transfer object) para um objeto do model
//@Data -> faz todas as configurações dos métodos acima
@Entity
public class WorkJourney {

    @Id
    private long id;
    private String descricao;

}