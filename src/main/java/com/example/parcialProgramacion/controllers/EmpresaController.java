package com.example.parcialProgramacion.controllers;

import com.example.parcialProgramacion.entities.Empresa;
import com.example.parcialProgramacion.services.EmpresaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empresas")
public class EmpresaController extends BaseController<Empresa, Long> {

    public EmpresaController(EmpresaService empresaService){
        super(empresaService);
    }

}
