package com.example.parcialProgramacion.services;

import com.example.parcialProgramacion.entities.Factura;
import com.example.parcialProgramacion.repositories.FacturaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaService extends BaseService<Factura, Long> {

    public FacturaService(FacturaRepository facturaRepository){super(facturaRepository);}

    @Autowired
    private FacturaRepository facturaRepository;

    @Transactional
    public List<Factura> getFacturasByPedidoId(Long pedidoId) throws Exception{
        try {
            return facturaRepository.findByPedidoId(pedidoId);
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

}
