package com.example.parcialProgramacion.repositories;

import com.example.parcialProgramacion.entities.Articulo;
import com.example.parcialProgramacion.entities.ArticuloInsumo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticuloInsumoRepository extends BaseRepository<ArticuloInsumo, Long> {
    List<Articulo> findByCategoriaId(Long categoriaId);
}
