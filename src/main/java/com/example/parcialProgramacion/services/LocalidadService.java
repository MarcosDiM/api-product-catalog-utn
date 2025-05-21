package com.example.parcialProgramacion.services;

import com.example.parcialProgramacion.entities.Localidad;
import com.example.parcialProgramacion.repositories.LocalidadRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalidadService extends BaseService<Localidad, Long> {

    public LocalidadService(LocalidadRepository localidadRepository){
        super(localidadRepository);
    }

    @Autowired
    private LocalidadRepository localidadRepository;

    @Transactional
    public List<Localidad> getLocalidadesByProvinciaId(Long provinciaId) throws Exception{
        try {
            return localidadRepository.findByProvinciaId(provinciaId);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
