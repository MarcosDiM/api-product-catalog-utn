package com.example.parcialProgramacion.services;


import com.example.parcialProgramacion.entities.Categoria;
import com.example.parcialProgramacion.entities.Cliente;
import com.example.parcialProgramacion.entities.Domicilio;
import com.example.parcialProgramacion.entities.Sucursal;
import com.example.parcialProgramacion.repositories.BaseRepository;
import com.example.parcialProgramacion.repositories.ClienteRepository;
import com.example.parcialProgramacion.repositories.SucursalRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService extends BaseService<Cliente, Long> {

    public ClienteService(ClienteRepository clienteRepository){
        super(clienteRepository);
    }

    @Autowired
    ClienteRepository clienteRepository;


    @Transactional
    public List<Domicilio> getDomicilioByCliente(Long clienteId) throws Exception{
        try {
            Cliente cliente = clienteRepository.findById(clienteId).orElse(null);
            if (cliente != null) {
                return new ArrayList<>(cliente.getDomicilios());
            } else {
                return null;
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
