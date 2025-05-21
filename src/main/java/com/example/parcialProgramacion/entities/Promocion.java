package com.example.parcialProgramacion.entities;

import com.example.parcialProgramacion.entities.enums.TipoPromocion;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "promociones")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Promocion extends Base {

    private String denominacion;
    @Column(name = "fecha_desde")
    private LocalDate fechaDesde;
    @Column(name = "fecha_hasta")
    private LocalDate fechaHasta;
    @Column(name = "hora_desde")
    private LocalTime horaDesde;
    @Column(name = "hora_hasta")
    private LocalTime horaHasta;
    @Column(name = "descripcion_descuento")
    private String descripcionDescuento;
    @Column(name = "precio_promocional")
    private Double precioPromocional;
    @Column(name = "tipo_promocion")
    private TipoPromocion tipoPromocion;

    @OneToMany
    @Builder.Default
    private Set<Imagen> imagenesPromocion = new HashSet<>();

}
