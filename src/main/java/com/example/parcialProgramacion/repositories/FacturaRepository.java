package com.example.parcialProgramacion.repositories;

import com.example.parcialProgramacion.entities.Base;
import com.example.parcialProgramacion.entities.Factura;
import com.example.parcialProgramacion.entities.Pedido;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FacturaRepository extends BaseRepository<Factura, Long> {
    List<Factura> findByPedidoId(Long pedidoId);
}
