package com.example.parcialProgramacion.repositories;

import com.example.parcialProgramacion.entities.Empresa;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends BaseRepository<Empresa, Long> {
}
