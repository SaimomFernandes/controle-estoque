package br.com.controle_estoque.projet.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "products")
public class ProjetModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID UUID;
    private String name;
    private String description;
    private double price;
    private int quantity;

    // Constructors
    public ProjetModel() {}

    public ProjetModel(String name, String description, double price, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    

}
