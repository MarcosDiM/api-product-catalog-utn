package com.example.parcialProgramacion.repositories;

import com.example.parcialProgramacion.entities.Sucursal;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SucursalRepository extends BaseRepository<Sucursal, Long> {
    List<Sucursal> findByEmpresaId(Long empresaId);
}
