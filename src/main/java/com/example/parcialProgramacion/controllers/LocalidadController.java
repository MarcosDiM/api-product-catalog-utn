package com.example.parcialProgramacion.controllers;

import com.example.parcialProgramacion.entities.Localidad;
import com.example.parcialProgramacion.services.LocalidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/localidades")
public class LocalidadController extends BaseController<Localidad, Long> {

    public LocalidadController(LocalidadService localidadService){
        super(localidadService);
    }

    @Autowired
    private LocalidadService localidadService;

    @GetMapping("/provincia/{provinciaId}")
    public List<Localidad> getLocalidadesByProvinciaId(@PathVariable Long provinciaId)throws Exception{
        return localidadService.getLocalidadesByProvinciaId(provinciaId);
    }

}
