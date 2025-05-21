package com.example.parcialProgramacion.services;

import com.example.parcialProgramacion.entities.PromocionDetalle;
import com.example.parcialProgramacion.repositories.PromocionDetalleRepository;
import org.springframework.stereotype.Service;

@Service
public class PromocionDetalleService extends BaseService<PromocionDetalle, Long> {

    public PromocionDetalleService(PromocionDetalleRepository promocionDetalleRepository){
        super(promocionDetalleRepository);
    }

}
