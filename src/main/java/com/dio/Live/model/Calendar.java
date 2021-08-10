package com.dio.Live.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Calendar {

    @Id
    private long id;
    private DateType dateType;
    private String descricao;
    private LocalDateTime dataEspecial;
}
