package com.example.parcialProgramacion.controllers;

import com.example.parcialProgramacion.entities.Categoria;
import com.example.parcialProgramacion.entities.Cliente;
import com.example.parcialProgramacion.entities.Domicilio;
import com.example.parcialProgramacion.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController extends BaseController<Cliente, Long>{

    public ClienteController(ClienteService clienteService){
        super(clienteService);
    }

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/domicilio/{clienteId}")
    public List<Domicilio> getDomicilioByCliente(@PathVariable Long clienteId) throws Exception{
        return clienteService.getDomicilioByCliente(clienteId);
    }

}
