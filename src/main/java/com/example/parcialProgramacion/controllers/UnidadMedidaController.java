package com.example.parcialProgramacion.controllers;

import com.example.parcialProgramacion.entities.UnidadMedida;
import com.example.parcialProgramacion.services.UnidadMedidaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/unidadMedida")
public class UnidadMedidaController extends BaseController<UnidadMedida, Long> {

    public UnidadMedidaController(UnidadMedidaService unidadMedidaService){
        super(unidadMedidaService);
    }

}
