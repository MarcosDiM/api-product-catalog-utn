package com.example.parcialProgramacion.services;

import com.example.parcialProgramacion.entities.Domicilio;
import com.example.parcialProgramacion.entities.Pais;
import com.example.parcialProgramacion.repositories.PaisRepository;
import com.example.parcialProgramacion.repositories.ProvinciaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaisService extends BaseService<Pais, Long> {

    public PaisService(PaisRepository paisRepository){
        super(paisRepository);
    }

}
