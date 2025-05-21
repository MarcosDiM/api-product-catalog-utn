package com.example.parcialProgramacion.repositories;

import com.example.parcialProgramacion.entities.Categoria;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends BaseRepository<Categoria, Long> {

    List<Categoria> findAllByCategoriaPadre_Id(Long idCategoriaPadre);

}
