package com.example.parcialProgramacion.services;

import com.example.parcialProgramacion.entities.Articulo;
import com.example.parcialProgramacion.entities.ArticuloManufacturado;
import com.example.parcialProgramacion.repositories.ArticuloInsumoRepository;
import com.example.parcialProgramacion.repositories.ArticuloManufacturadoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticuloManufacturadoService extends BaseService<ArticuloManufacturado, Long> {

    public ArticuloManufacturadoService(ArticuloManufacturadoRepository articuloManufacturadoRepository){
        super(articuloManufacturadoRepository);}

    @Autowired
    private ArticuloManufacturadoRepository articuloManufacturadoRepository;

    @Transactional
    public List<Articulo> getArticulosByCategoriaId(Long categoriaId) throws Exception{
        try {
            return articuloManufacturadoRepository.findByCategoriaId(categoriaId);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
