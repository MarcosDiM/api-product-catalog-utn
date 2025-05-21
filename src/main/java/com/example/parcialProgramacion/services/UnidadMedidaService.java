package com.example.parcialProgramacion.services;

import com.example.parcialProgramacion.entities.UnidadMedida;
import com.example.parcialProgramacion.repositories.UnidadMedidaRepository;
import org.springframework.stereotype.Service;

@Service
public class UnidadMedidaService extends BaseService<UnidadMedida, Long> {

    public UnidadMedidaService(UnidadMedidaRepository unidadMedidaRepository){
        super(unidadMedidaRepository);
    }

}
