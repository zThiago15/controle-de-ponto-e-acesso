package com.dio.Live.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor //Faz a construção do método da classe com as propriedades como parâmetros
@NoArgsConstructor // Construtor sem argumentos
@EqualsAndHashCode
@Builder // Faz a transferência de um dto(data transfer object) para um objeto do modelo

//@Data -> faz todas as configurações dos métodos acima
public class WorkJourney {

    private long id;
    private String descricao;

}