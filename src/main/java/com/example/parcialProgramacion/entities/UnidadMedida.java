package com.example.parcialProgramacion.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "UNIDAD_MEDID")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UnidadMedida extends Base{

    private String denominacion;

    @ManyToOne
    @JoinColumn(name = "articulo_id")
    private Articulo articulo;

}
