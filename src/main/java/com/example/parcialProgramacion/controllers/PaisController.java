package com.example.parcialProgramacion.controllers;

import com.example.parcialProgramacion.entities.Pais;
import com.example.parcialProgramacion.services.PaisService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paises")
public class PaisController extends BaseController<Pais, Long> {

    public PaisController(PaisService paisService){
        super(paisService);
    }

}
