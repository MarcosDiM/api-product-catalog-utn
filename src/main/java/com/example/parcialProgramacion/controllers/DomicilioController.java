package com.example.parcialProgramacion.controllers;

import com.example.parcialProgramacion.entities.Domicilio;
import com.example.parcialProgramacion.services.DomicilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/domicilios")
public class DomicilioController extends BaseController<Domicilio, Long> {

    public DomicilioController(DomicilioService domicilioService){
        super(domicilioService);
    }

    @Autowired
    private DomicilioService domicilioService;

    @GetMapping("/localidad/{localidadId}")
    public List<Domicilio> getDomiciliosByLocalidadId(@PathVariable Long localidadId) throws Exception{
        return domicilioService.getDomiciliosByLocalidadId(localidadId);
    }
}
