package com.example.parcialProgramacion.controllers;

import com.example.parcialProgramacion.entities.Articulo;
import com.example.parcialProgramacion.entities.ArticuloInsumo;
import com.example.parcialProgramacion.services.ArticuloInsumoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/articuloInsumo")
public class ArticuloInsumoController extends BaseController<ArticuloInsumo, Long> {

    public ArticuloInsumoController(ArticuloInsumoService articuloInsumoService){
        super(articuloInsumoService);
    }

    @Autowired
    private ArticuloInsumoService articuloInsumoService;

    @GetMapping("/categoria/{categoriaId}")
    public List<Articulo> getArticulosByCategoriaId(@PathVariable Long categoriaId) throws Exception {
        return articuloInsumoService.getArticulosByCategoriaId(categoriaId);
    }

}
