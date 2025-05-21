package com.example.parcialProgramacion.repositories;

import com.example.parcialProgramacion.entities.Provincia;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProvinciaRepository extends BaseRepository<Provincia, Long> {
    List<Provincia> findByPaisId(Long paisId);
}
