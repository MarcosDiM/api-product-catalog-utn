package com.example.parcialProgramacion.entities;

import com.example.parcialProgramacion.entities.enums.Rol;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@MappedSuperclass
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Persona extends Base {

    protected String nombre;
    protected String apellido;
    protected String telefono;
    protected String email;
    @Column(name = "fecha_nacimiento")
    protected LocalDate fechaNacimiento;
    protected Rol rol;

    @OneToOne
    @JoinColumn(name = "imagen_id")
    protected Imagen imagenPersona;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    protected Usuario usuario;

}
