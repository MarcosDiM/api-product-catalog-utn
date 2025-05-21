package com.example.parcialProgramacion.services;

import com.example.parcialProgramacion.entities.Categoria;
import com.example.parcialProgramacion.entities.Factura;
import com.example.parcialProgramacion.entities.Promocion;
import com.example.parcialProgramacion.entities.Sucursal;
import com.example.parcialProgramacion.repositories.SucursalRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SucursalService extends BaseService<Sucursal, Long> {

    public SucursalService(SucursalRepository sucursalRepository){
        super(sucursalRepository);
    }

    @Autowired
    SucursalRepository sucursalRepository;


    @Transactional
    public List<Sucursal> getSucursalByEmpresaId(Long empresaId) throws Exception{
        try {
            return sucursalRepository.findByEmpresaId(empresaId);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }


    @Transactional
    public List<Categoria> getCategoriaBySucursal(Long sucursalId) throws Exception{
        try {
            Sucursal sucursal = sucursalRepository.findById(sucursalId).orElse(null);
            if (sucursal != null) {
                return new ArrayList<>(sucursal.getCategorias());
            } else {
                return null;
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<Promocion> getPromocionBySucursal(Long sucursalId) throws Exception{
        try {
            Sucursal sucursal = sucursalRepository.findById(sucursalId).orElse(null);
            if (sucursal != null) {
                return new ArrayList<>(sucursal.getPromociones());
            } else {
                return null;
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
