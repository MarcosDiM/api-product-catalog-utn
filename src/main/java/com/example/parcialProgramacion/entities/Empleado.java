package com.example.parcialProgramacion.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "empleados")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Empleado extends Persona{

    @ManyToOne
    @JoinColumn(name = "sucursal_id")
    private Sucursal sucursal;

}
