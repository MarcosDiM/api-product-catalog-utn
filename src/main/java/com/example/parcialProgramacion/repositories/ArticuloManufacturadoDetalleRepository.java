package com.example.parcialProgramacion.repositories;

import com.example.parcialProgramacion.entities.ArticuloManufacturadoDetalle;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticuloManufacturadoDetalleRepository extends BaseRepository<ArticuloManufacturadoDetalle, Long> {
    List<ArticuloManufacturadoDetalle> findByArticuloInsumoId(Long articuloInsumoId);
    List<ArticuloManufacturadoDetalle> findByArticuloManufacturadoId(Long articuloManufacturadoId);

}
