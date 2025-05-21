package com.example.parcialProgramacion.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "sucursales")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Sucursal extends Base{

    private String nombre;
    @Column(name = "horario_apertura")
    private LocalTime horarioApertura;
    @Column(name = "horario_cierre")
    private LocalTime horarioCierre;
    @Column(name = "casa_matriz")
    private Boolean casaMatriz;

    @OneToOne
    @JoinColumn(name = "domicilio_id")
    private Domicilio domicilio;

    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;

    @ManyToMany
    @JoinTable(name = "sucursal_categoria",
        joinColumns = @JoinColumn(name = "sucursal_id"),
        inverseJoinColumns = @JoinColumn(name = "categoria_id"))
    @Builder.Default
    private Set<Categoria> categorias = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "sucursal_promocion",
        joinColumns = @JoinColumn(name = "sucursal_id"),
        inverseJoinColumns = @JoinColumn(name = "promocion_id"))
    @Builder.Default
    private Set<Promocion> promociones = new HashSet<>();

}
