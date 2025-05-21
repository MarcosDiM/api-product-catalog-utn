package com.example.parcialProgramacion.services;


import com.example.parcialProgramacion.entities.Empresa;
import com.example.parcialProgramacion.repositories.EmpresaRepository;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService extends BaseService<Empresa, Long> {

    public EmpresaService(EmpresaRepository empresaRepository){
        super(empresaRepository);
    }

}
