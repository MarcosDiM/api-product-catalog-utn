package com.example.parcialProgramacion.controllers;

import com.example.parcialProgramacion.entities.Categoria;
import com.example.parcialProgramacion.entities.Factura;
import com.example.parcialProgramacion.entities.Promocion;
import com.example.parcialProgramacion.entities.Sucursal;
import com.example.parcialProgramacion.services.BaseService;
import com.example.parcialProgramacion.services.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sucursales")
public class SucursalController extends BaseController<Sucursal, Long> {

    public SucursalController(SucursalService sucursalService){
        super(sucursalService);
    }

    @Autowired
    SucursalService sucursalService;

    @GetMapping("/empresa/{empresaId}")
    public List<Sucursal> getSucursalByEmpresaId(@PathVariable Long empresaId) throws Exception{
        return sucursalService.getSucursalByEmpresaId(empresaId);
    }

    @GetMapping("/categoria/{sucursalId}")
    public List<Categoria> getCategoriasBySucursal(@PathVariable Long sucursalId) throws Exception{
        return sucursalService.getCategoriaBySucursal(sucursalId);
    }

    @GetMapping("/promocion/{sucursalId}")
    public List<Promocion> getPromocionesBySucursal(@PathVariable Long sucursalId) throws Exception{
        return sucursalService.getPromocionBySucursal(sucursalId);
    }
}
