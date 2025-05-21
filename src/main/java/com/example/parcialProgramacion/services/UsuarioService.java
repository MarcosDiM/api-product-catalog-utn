package com.example.parcialProgramacion.services;


import com.example.parcialProgramacion.entities.Usuario;
import com.example.parcialProgramacion.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService extends BaseService<Usuario, Long> {

    public UsuarioService(UsuarioRepository usuarioRepository){
        super(usuarioRepository);
    }

}
