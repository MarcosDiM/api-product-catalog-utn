package com.example.parcialProgramacion.repositories;

import com.example.parcialProgramacion.entities.Imagen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagenRepository extends BaseRepository<Imagen, Long> {
}
