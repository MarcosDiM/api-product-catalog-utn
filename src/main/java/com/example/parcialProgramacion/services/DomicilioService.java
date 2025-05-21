package com.example.parcialProgramacion.services;

import com.example.parcialProgramacion.entities.Domicilio;
import com.example.parcialProgramacion.repositories.DomicilioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DomicilioService extends BaseService<Domicilio, Long> {

    public DomicilioService(DomicilioRepository domicilioRepository){
        super(domicilioRepository);
    }

    @Autowired
    private DomicilioRepository domicilioRepository;

    @Transactional
    public List<Domicilio> getDomiciliosByLocalidadId(Long localidadId) throws Exception{
        try{
            return domicilioRepository.findByLocalidadId(localidadId);
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }
}
