package com.example.parcialProgramacion.services;

import com.example.parcialProgramacion.entities.ArticuloManufacturadoDetalle;
import com.example.parcialProgramacion.entities.Factura;
import com.example.parcialProgramacion.repositories.ArticuloManufacturadoDetalleRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticuloManufacturadoDetalleService extends BaseService<ArticuloManufacturadoDetalle, Long> {

    public ArticuloManufacturadoDetalleService(ArticuloManufacturadoDetalleRepository articuloManufacturadoDetalleRepository){
        super(articuloManufacturadoDetalleRepository);
    }

    @Autowired
    private ArticuloManufacturadoDetalleRepository articuloManufacturadoDetalleRepository;

    @Transactional
    public List<ArticuloManufacturadoDetalle> getArtManufDetByArtInsId(Long articuloInsumoId) throws Exception{
        try {
            return articuloManufacturadoDetalleRepository.findByArticuloInsumoId(articuloInsumoId);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<ArticuloManufacturadoDetalle> getArtManufDetByArtManufId(Long articuloManufacturadoId) throws Exception{
        try {
            return articuloManufacturadoDetalleRepository.findByArticuloManufacturadoId(articuloManufacturadoId);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
