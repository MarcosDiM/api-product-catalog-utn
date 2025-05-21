package com.example.parcialProgramacion.repositories;

import com.example.parcialProgramacion.entities.Promocion;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PromocionRepository extends BaseRepository<Promocion, Long> {
}
