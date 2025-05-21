package com.example.parcialProgramacion.repositories;

import com.example.parcialProgramacion.entities.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpleadoRepository extends BaseRepository<Empleado, Long> {
    List<Empleado> findBySucursalId(Long sucursalId);
}
