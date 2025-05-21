package com.example.parcialProgramacion.controllers;

import com.example.parcialProgramacion.entities.Imagen;
import com.example.parcialProgramacion.services.ImagenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/imagenes")
public class ImagenController extends BaseController<Imagen, Long> {

    public ImagenController(ImagenService imagenService){
        super(imagenService);
    }

}
