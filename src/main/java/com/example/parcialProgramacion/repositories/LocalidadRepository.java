package com.example.parcialProgramacion.repositories;

import com.example.parcialProgramacion.entities.Factura;
import com.example.parcialProgramacion.entities.Localidad;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocalidadRepository extends BaseRepository<Localidad, Long> {
    List<Localidad> findByProvinciaId(Long provinciaId);
}
