package com.example.parcialProgramacion.services;

import com.example.parcialProgramacion.entities.Categoria;
import com.example.parcialProgramacion.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@Service
public class CategoriaService extends BaseService<Categoria, Long> {

    public CategoriaService(CategoriaRepository categoriaRepository) {
        super(categoriaRepository);
    }

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Transactional
    public Categoria agregarSubcategoria(Long idCategoriaPadre, Categoria nuevaSubcategoria) throws Exception {
        try{
            // Obtener la categoría existente
            Categoria categoriaPadre = categoriaRepository.findById(idCategoriaPadre).orElse(null);
            if (categoriaPadre != null) {
                // Establecer la categoría existente como padre de la nueva subcategoría
                nuevaSubcategoria.setCategoriaPadre(categoriaPadre);
                //Creo la subCategoria como una nueva Categoria
                categoriaRepository.save(nuevaSubcategoria);
                return nuevaSubcategoria;
            } else {
                // Manejar el caso en el que la categoría existente no se encuentre
                return null;
            }
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    @Transactional
    public List<Categoria> listarPorCategoriaPadre(Long idCategoriaPadre) throws Exception {
        try {
            return categoriaRepository.findAllByCategoriaPadre_Id(idCategoriaPadre);
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
}
