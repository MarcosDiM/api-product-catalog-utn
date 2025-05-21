package com.example.parcialProgramacion.repositories;

import com.example.parcialProgramacion.entities.Domicilio;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DomicilioRepository extends BaseRepository<Domicilio, Long> {
    List<Domicilio> findByLocalidadId(Long localidadId);
}
