package com.example.parcialProgramacion.services;

import com.example.parcialProgramacion.entities.Articulo;
import com.example.parcialProgramacion.entities.ArticuloInsumo;
import com.example.parcialProgramacion.entities.Sucursal;
import com.example.parcialProgramacion.repositories.ArticuloInsumoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticuloInsumoService extends BaseService<ArticuloInsumo, Long> {

    public ArticuloInsumoService(ArticuloInsumoRepository articuloInsumoRepository){
        super(articuloInsumoRepository);
    }

    @Autowired
    private ArticuloInsumoRepository articuloInsumoRepository;

    @Transactional
    public List<Articulo> getArticulosByCategoriaId (Long categoriaId) throws Exception{
        try {
            return articuloInsumoRepository.findByCategoriaId(categoriaId);

        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
