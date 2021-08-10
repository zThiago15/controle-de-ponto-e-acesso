package com.dio.Live.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Ocurrency {

    private long id;
    private String nome;
    private String descricao;
}
