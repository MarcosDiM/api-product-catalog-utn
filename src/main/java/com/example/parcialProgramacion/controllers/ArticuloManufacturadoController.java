package com.example.parcialProgramacion.controllers;

import com.example.parcialProgramacion.entities.Articulo;
import com.example.parcialProgramacion.entities.ArticuloManufacturado;
import com.example.parcialProgramacion.services.ArticuloManufacturadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/articuloManufacturado")
public class ArticuloManufacturadoController extends BaseController<ArticuloManufacturado, Long> {

    public ArticuloManufacturadoController(ArticuloManufacturadoService articuloManufacturadoService){
        super(articuloManufacturadoService);
    }

    @Autowired
    private ArticuloManufacturadoService articuloManufacturadoService;

    @GetMapping("/categoria/{categoriaId}")
    public List<Articulo> getArticulosByCategoriaId(@PathVariable Long categoriaId) throws Exception{
        return articuloManufacturadoService.getArticulosByCategoriaId(categoriaId);
    }

}
