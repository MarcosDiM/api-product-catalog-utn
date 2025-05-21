package com.example.parcialProgramacion.repositories;

import com.example.parcialProgramacion.entities.DetallePedido;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetallePedidoRepository extends BaseRepository<DetallePedido, Long> {

    List<DetallePedido> findAllByPedidoId(Long idPedido);

}
