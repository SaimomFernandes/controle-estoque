package br.com.controle_estoque.projet.model;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_category")
public class projetCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;
    
    @Column(nullable = false, unique = true)
    private String name;

   

 

}
