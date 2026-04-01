package br.com.controle_estoque.projet.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.controle_estoque.projet.model.ProjetModel;

@Repository
public interface projetRepository extends JpaRepository<ProjetModel, UUID> {

}
