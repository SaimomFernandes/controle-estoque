package br.com.controle_estoque.projet.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.controle_estoque.projet.model.ProjetModel;
import br.com.controle_estoque.projet.repository.projetRepository;

@RestController
@RequestMapping("/api/products")
public class projetController {


    @Autowired
    private projetRepository repository;

    @PostMapping("/create")
    public ProjetModel create(@RequestBody ProjetModel projetModel) {
        var savedProjetModel = this.repository.save(projetModel);
        return savedProjetModel;
    }

    @GetMapping("/")
    public List<ProjetModel> getAll() {
        return this.repository.findAll();
    }

    @GetMapping("/{id}")
    public ProjetModel buscar(@PathVariable UUID id){
        return this.repository.findById(id).orElse(null);
    } 


    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id){
        this.repository.deleteById(id);
    }

}
