package com.example.parcialProgramacion.services;


import com.example.parcialProgramacion.entities.Imagen;
import com.example.parcialProgramacion.repositories.ImagenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImagenService extends BaseService<Imagen, Long>{

    public ImagenService(ImagenRepository imagenRepository){
        super(imagenRepository);
    }

}
