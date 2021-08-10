package com.dio.Live.model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Calendar {

    private long id;
    private DateType dateType;
    private String descricao;
    private LocalDateTime dataEspecial;
}
