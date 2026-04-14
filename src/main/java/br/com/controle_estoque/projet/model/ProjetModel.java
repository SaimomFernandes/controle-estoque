package br.com.controle_estoque.projet.model;

import java.util.UUID;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;


@Data
@Entity(name = "products")

public class ProjetModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "char(36)") // Força o MySQL a criar um campo de texto fixo
    @JdbcTypeCode(SqlTypes.CHAR) // Diz ao Hibernate 6 para tratar como caractere
    private UUID id;
    private String name;
    private String description;
    private double price;
    private int quantity;

    

     @ManyToOne // Muitos produtos pertencem a UMA categoria
    @JoinColumn(name = "category_id") // Nome da coluna que será a FK no banco
    private projetCategory category;

    // Constructors
    public ProjetModel() {}

    public ProjetModel(String name, String description, double price, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    

}
