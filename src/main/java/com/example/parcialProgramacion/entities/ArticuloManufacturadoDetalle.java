package com.example.parcialProgramacion.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "articulos_manufacturados_detalle")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ArticuloManufacturadoDetalle extends Base{

    private Integer cantidad;

    @ManyToOne
    @JoinColumn(name = "articulo_insumo_id")
    private ArticuloInsumo articuloInsumo;

    @ManyToOne
    @JoinColumn(name = "articulo_manufacturado_id")
    private ArticuloManufacturado articuloManufacturado;

}
