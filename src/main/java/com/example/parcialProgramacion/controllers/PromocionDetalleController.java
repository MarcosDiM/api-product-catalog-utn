package com.example.parcialProgramacion.controllers;

import com.example.parcialProgramacion.entities.PromocionDetalle;
import com.example.parcialProgramacion.services.PromocionDetalleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/promocionDetalle")
public class PromocionDetalleController extends BaseController<PromocionDetalle, Long> {

    public PromocionDetalleController(PromocionDetalleService promocionDetalleService){
        super(promocionDetalleService);
    }

}
