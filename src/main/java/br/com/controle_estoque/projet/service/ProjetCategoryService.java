package br.com.controle_estoque.projet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.controle_estoque.projet.model.projetCategory;
import br.com.controle_estoque.projet.repository.projetCateRepo;


@Service
public class ProjetCategoryService {

    @Autowired
    private projetCateRepo repository;

    public projetCategory salvar(projetCategory categoria) {
        return repository.save(categoria);
    }

    public List<projetCategory> listarTodas() {
        return repository.findAll();
    }
}
