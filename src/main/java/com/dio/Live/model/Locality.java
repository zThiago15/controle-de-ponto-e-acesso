package com.dio.Live.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Locality {
    @Id
    private long id;

    @ManyToOne
    private AcessLevel acessLevel;


    private String descricao;
}


//getter e setter autom, construct with args and no args of the method of class, builder to connect the dto with the objects of the class
//euqalsHashAndCode it's for security and cryptograph
