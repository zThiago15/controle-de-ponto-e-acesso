package com.dio.Live.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder //mapeia o dto com o objeto do modelo
public class UserCategory {

    private long id;
    private String descricao;

}
