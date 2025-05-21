package com.example.parcialProgramacion.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "paises")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pais extends Base{

    private String nombre;

}
