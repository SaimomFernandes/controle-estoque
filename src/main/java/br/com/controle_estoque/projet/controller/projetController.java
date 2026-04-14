package br.com.controle_estoque.projet.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.controle_estoque.projet.model.ProjetModel;
import br.com.controle_estoque.projet.repository.projetRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/products")
@Tag(name = "Produtos") // Isso cria um título "Produtos" lá no site do Swagger
public class projetController {


    @Autowired
    private projetRepository repository;

    @Operation(summary = "Cadastra um novo produto") // Isso vira a legenda do botão no Swagger
    @PostMapping("/create")
    public ProjetModel create(@RequestBody ProjetModel projetModel) {
        var savedProjetModel = this.repository.save(projetModel);
        return savedProjetModel;
    }

    @Operation(summary = "Lista todos os produtos do estoque")
    @GetMapping("/")
    public List<ProjetModel> getAll() {
        return this.repository.findAll();
    }

    @Operation(summary = "Busca um produto pelo UUID")
    @GetMapping("/{id}")
     public ResponseEntity<ProjetModel> buscar(@PathVariable UUID id){
        return repository.findById(id)
            .map(produto -> ResponseEntity.ok().body(produto))
            .orElse(ResponseEntity.notFound().build());
    }


    @Operation(summary = "Deleta um produto do sistema")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id){
        this.repository.deleteById(id);
    }

}
