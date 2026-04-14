package br.com.controle_estoque.projet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.controle_estoque.projet.model.projetCategory;
import br.com.controle_estoque.projet.service.ProjetCategoryService;

@RestController
@RequestMapping("/categorias")
public class ProjetCategoryController {

   @Autowired
    private ProjetCategoryService service;

    @PostMapping("/create")
    public projetCategory criar(@RequestBody projetCategory categoria) {
        return service.salvar(categoria);
    }

    @GetMapping("/list")
    public List<projetCategory> listar() {
        return service.listarTodas();
    }


    
}
