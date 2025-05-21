package com.example.parcialProgramacion.controllers;

import com.example.parcialProgramacion.entities.Empleado;
import com.example.parcialProgramacion.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController extends BaseController<Empleado, Long> {

    public EmpleadoController(EmpleadoService empleadoService){
        super(empleadoService);
    }

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping("/sucursal/{sucursalId}")
    public List<Empleado> getEmpleadosBySucursalId(@PathVariable Long sucursalId) throws Exception{
        return empleadoService.getEmpleadosBySucursalId(sucursalId);
    }
}
