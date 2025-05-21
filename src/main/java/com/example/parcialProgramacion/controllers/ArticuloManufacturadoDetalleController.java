package com.example.parcialProgramacion.controllers;

import com.example.parcialProgramacion.entities.Articulo;
import com.example.parcialProgramacion.entities.ArticuloManufacturado;
import com.example.parcialProgramacion.entities.ArticuloManufacturadoDetalle;
import com.example.parcialProgramacion.entities.Factura;
import com.example.parcialProgramacion.repositories.ArticuloManufacturadoDetalleRepository;
import com.example.parcialProgramacion.services.ArticuloInsumoService;
import com.example.parcialProgramacion.services.ArticuloManufacturadoDetalleService;
import com.example.parcialProgramacion.services.ArticuloManufacturadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/articuloManufacturadoDetalle")
public class ArticuloManufacturadoDetalleController extends BaseController<ArticuloManufacturadoDetalle, Long> {

    public ArticuloManufacturadoDetalleController(ArticuloManufacturadoDetalleService articuloManufacturadoDetalleService){
        super(articuloManufacturadoDetalleService);}

    @Autowired
    private ArticuloManufacturadoDetalleService articuloManufacturadoDetalleService;

    @GetMapping("/articuloInsumo/{articuloInsumoId}")
    public List<ArticuloManufacturadoDetalle> getArtManufByArtInsId(@PathVariable Long articuloInsumoId) throws Exception{
        return articuloManufacturadoDetalleService.getArtManufDetByArtInsId(articuloInsumoId);
    }

    @GetMapping("/articuloManufacturado/{articuloManufacturadoId}")
    public List<ArticuloManufacturadoDetalle> getArtManufByArtManufId(@PathVariable Long articuloManufacturadoId) throws Exception{
        return articuloManufacturadoDetalleService.getArtManufDetByArtManufId(articuloManufacturadoId);
    }
}
