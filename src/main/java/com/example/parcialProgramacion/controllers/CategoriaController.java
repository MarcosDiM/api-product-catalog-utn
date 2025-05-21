package com.example.parcialProgramacion.controllers;

import com.example.parcialProgramacion.entities.Categoria;
import com.example.parcialProgramacion.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categorias")
public class CategoriaController extends BaseController<Categoria, Long> {

    public CategoriaController(CategoriaService categoriaService){
        super(categoriaService);
    }

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping("/subcategoria/{idCP}")
    public Optional<Categoria> agregarSubcategoria(@PathVariable Long id_CP, @RequestBody Categoria subcategoria) throws Exception {
        Categoria catPadre = categoriaService.agregarSubcategoria(id_CP, subcategoria);
        return Optional.ofNullable(catPadre);
    }

    @GetMapping("/categoriaPadre/{id}")
    public ResponseEntity<List<Categoria>> listarPorCategoriaPadre(@PathVariable Long id) throws Exception {
        List<Categoria> categorias = categoriaService.listarPorCategoriaPadre(id);
        return ResponseEntity.ok(categorias);
    }
}
