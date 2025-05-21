package com.example.parcialProgramacion.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "provincias")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Provincia extends Base{

    private String nombre;

    @ManyToOne
    @JoinColumn(name = "pais_id")
    private Pais pais;

}
