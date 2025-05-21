package com.example.parcialProgramacion.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "imagen")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Imagen extends Base{

    @Column(name = "denominacion")
    private String denominacion;

}
