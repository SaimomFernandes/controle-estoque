package br.com.controle_estoque.projet.model;

import java.util.List;
import java.util.UUID;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_category")
public class projetCategory {
    @Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(columnDefinition = "char(36)") // Força o MySQL a criar um campo de texto fixo
@JdbcTypeCode(SqlTypes.CHAR) // Diz ao Hibernate 6 para tratar como caractere
private UUID id;
    
    @Column(nullable = false, unique = true)
    private String name;

   

 

}
