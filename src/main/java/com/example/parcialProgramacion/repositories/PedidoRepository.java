package com.example.parcialProgramacion.repositories;

import com.example.parcialProgramacion.entities.Empleado;
import com.example.parcialProgramacion.entities.Pedido;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends BaseRepository<Pedido, Long> {
    List<Pedido> findByclienteId(Long clienteId);
    List<Pedido> findByempleadoId(Long empleadoId);
    List<Pedido> findBysucursalId(Long sucursalId);
}
