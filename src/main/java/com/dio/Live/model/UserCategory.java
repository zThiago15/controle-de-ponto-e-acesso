package com.dio.Live.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder //mapeia o dto com o objeto do modelo
@Entity
public class UserCategory {

    @Id
    private long id;
    private String descricao;

}
