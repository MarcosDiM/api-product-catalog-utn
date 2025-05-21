package com.example.parcialProgramacion.controllers;

import com.example.parcialProgramacion.entities.Promocion;
import com.example.parcialProgramacion.services.PromocionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/promociones")
public class PromocionController extends BaseController<Promocion, Long> {

    public PromocionController(PromocionService promocionService){
        super(promocionService);
    }

    @Autowired
    private PromocionService promocionService;
}
