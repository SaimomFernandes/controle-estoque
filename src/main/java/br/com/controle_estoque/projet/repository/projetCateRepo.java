package br.com.controle_estoque.projet.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.controle_estoque.projet.model.projetCategory;

public interface projetCateRepo extends JpaRepository<projetCategory, UUID> {

}
