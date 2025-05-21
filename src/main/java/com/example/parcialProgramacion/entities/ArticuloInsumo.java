package com.example.parcialProgramacion.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "articulos_insumo")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class ArticuloInsumo extends Articulo{

    @Column(name = "precio_compra")
    private Double precioCompra;
    @Column(name = "stock_actual")
    private Integer stockActual;
    @Column(name = "stock_maximo")
    private Integer stockMaximo;
    @Column(name = "es_para_elaborar")
    private Boolean esParaElaborar;

}
