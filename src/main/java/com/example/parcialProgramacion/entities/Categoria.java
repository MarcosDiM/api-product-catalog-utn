package com.example.parcialProgramacion.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "categoria")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Categoria extends Base{

    private String denominacion;

    @OneToMany(mappedBy = "categoriaPadre")
    @Builder.Default
    private Set<Categoria> subcategorias = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "categoria_padre_id")
    @JsonIgnore //Impide que se genere un bucle en la llamada GET
    private Categoria categoriaPadre;

}
