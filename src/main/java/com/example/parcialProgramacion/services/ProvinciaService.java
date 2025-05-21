package com.example.parcialProgramacion.services;


import com.example.parcialProgramacion.entities.Categoria;
import com.example.parcialProgramacion.entities.Domicilio;
import com.example.parcialProgramacion.entities.Provincia;
import com.example.parcialProgramacion.entities.Sucursal;
import com.example.parcialProgramacion.repositories.ProvinciaRepository;
import com.example.parcialProgramacion.repositories.SucursalRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProvinciaService extends BaseService<Provincia, Long> {

    public ProvinciaService(ProvinciaRepository provinciaRepository){
        super(provinciaRepository);
    }

    @Autowired
    private ProvinciaRepository provinciaRepository;

    @Transactional
    public List<Provincia> getProvinciasByPaisId(Long paisId) throws Exception{
        try {
            return provinciaRepository.findByPaisId(paisId);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
