package com.example.parcialProgramacion.services;


import com.example.parcialProgramacion.entities.Factura;
import com.example.parcialProgramacion.entities.Promocion;
import com.example.parcialProgramacion.repositories.PromocionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromocionService extends BaseService<Promocion, Long> {

    public PromocionService(PromocionRepository promocionRepository){
        super(promocionRepository);
    }

}
