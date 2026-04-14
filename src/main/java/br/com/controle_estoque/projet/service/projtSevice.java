package br.com.controle_estoque.projet.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.controle_estoque.projet.model.ProjetModel;
import br.com.controle_estoque.projet.repository.projetRepository;

@Service
public class projtSevice {


    @Autowired
    private projetRepository repository;

    public ProjetModel createProduct(ProjetModel product) {
        
        // REGRA 1: O nome não pode ser vazio
        if (product.getName() == null || product.getName().trim().isEmpty()) {
            throw new RuntimeException("O nome do produto é obrigatório!");
        }

        // REGRA 2: O preço deve ser um valor positivo
        if (product.getPrice() <= 0) {
            throw new RuntimeException("O preço precisa ser maior que zero!");
        }

        // REGRA 3: A quantidade não pode ser negativa
        if (product.getQuantity() < 0) {
            throw new RuntimeException("A quantidade em estoque não pode ser negativa!");
        }

        // REGRA 4: Evitar duplicidade (MySQL vai agradecer essa organização)
        if (repository.existsById(product.getUUID())) {
            throw new RuntimeException("Já existe um produto cadastrado com este nome!");
        }

        // Se passar por todos os "filtros" (regras), salvamos no banco
        return repository.save(product);
    }

    // Exemplo de uma regra de negócio para "Venda" ou "Baixa de Estoque"
    public ProjetModel updateStock(Long id, int amountSold) {
        ProjetModel product = repository.findById(UUID.fromString(id.toString()))
            .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

        if (product.getQuantity() < amountSold) {
            throw new RuntimeException("Estoque insuficiente para a venda!");
        }

        product.setQuantity(product.getQuantity() - amountSold);
        return repository.save(product);
    }



}
