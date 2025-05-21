package com.example.parcialProgramacion.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "promocion_detalle")
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PromocionDetalle extends Base{

    private int cantidad;

    @ManyToOne
    @JoinColumn(name = "articulo_id")
    private Articulo articulo;

    @ManyToOne
    @JoinColumn(name = "promocion_id")
    private Promocion promocion;

}
