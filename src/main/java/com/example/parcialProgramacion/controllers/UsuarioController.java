package com.example.parcialProgramacion.controllers;

import com.example.parcialProgramacion.entities.Usuario;
import com.example.parcialProgramacion.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController extends BaseController<Usuario, Long> {

    public UsuarioController(UsuarioService usuarioService){
        super(usuarioService);
    }

}
