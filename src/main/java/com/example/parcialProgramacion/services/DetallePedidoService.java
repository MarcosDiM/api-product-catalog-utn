package com.example.parcialProgramacion.services;


import com.example.parcialProgramacion.entities.DetallePedido;
import com.example.parcialProgramacion.repositories.DetallePedidoRepository;
import org.hibernate.jdbc.Expectation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DetallePedidoService extends BaseService<DetallePedido, Long> {

    @Autowired
    private DetallePedidoRepository detallePedidoRepository;

    public DetallePedidoService(DetallePedidoRepository detallePedidoRepository){
        super(detallePedidoRepository);
    }

    @Transactional
    public List<DetallePedido> listarPorPedido(Long idPedido) throws Exception {
        try{
            return detallePedidoRepository.findAllByPedidoId(idPedido);
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }

    }

}
