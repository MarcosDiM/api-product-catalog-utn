package com.example.parcialProgramacion.repositories;

import com.example.parcialProgramacion.entities.Articulo;
import com.example.parcialProgramacion.entities.ArticuloManufacturado;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticuloManufacturadoRepository extends BaseRepository<ArticuloManufacturado, Long> {
    List<Articulo> findByCategoriaId(Long categoriaId);
}
