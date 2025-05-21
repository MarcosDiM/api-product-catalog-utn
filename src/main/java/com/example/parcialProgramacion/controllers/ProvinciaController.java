package com.example.parcialProgramacion.controllers;

import com.example.parcialProgramacion.entities.Provincia;
import com.example.parcialProgramacion.services.ProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/provincias")
public class ProvinciaController extends BaseController<Provincia, Long> {

    public ProvinciaController(ProvinciaService provinciaService){
        super(provinciaService);
    }

    @Autowired
    private ProvinciaService provinciaService;

    @GetMapping("/pais/{paisId}")
    public List<Provincia> getProvinciasByPaisId(@PathVariable Long paisId) throws Exception{
        return provinciaService.getProvinciasByPaisId(paisId);
    }

}
