# 📦 Inventory API - Sistema de Gerenciamento de Estoque

Esta é uma API REST desenvolvida com **Java e Spring Boot** focada no controle de produtos e inventário. O projeto foi estruturado seguindo as melhores práticas de arquitetura em camadas, visando um código limpo e de fácil manutenção.

## 🚀 Status do Projeto
O núcleo da API já está funcional, contando com a camada de persistência e os principais endpoints de CRUD (Create, Read, Update, Delete).

## 🛠️ Tecnologias e Ferramentas
- **Linguagem:** Java 17+
- **Framework:** Spring Boot 3.x
- **Persistência de Dados:** Spring Data JPA / Hibernate
- **Banco de Dados:** H2 Database (Banco em memória para testes ágeis)
- **Gerenciador de Dependências:** Maven
- **Produtividade:** Lombok (Annotations para redução de boilerplate)

## 📂 Arquitetura do Sistema
O projeto utiliza a separação por responsabilidades:
- **Model/Entity:** Mapeamento objeto-relacional da entidade Produto.
- **Repository:** Interface de comunicação direta com o banco de dados (Spring Data JPA).
- **Controller:** Endpoints da API para manipulação dos dados de estoque.

## 📋 Endpoints Principais 
- `GET /produtos` - Lista todos os produtos cadastrados.
- `GET /produtos/{id}` - Busca um produto específico pelo ID.
- `POST /produtos` - Cadastra um novo item no estoque.
- `PUT /produtos/{id}` - Atualiza informações de um produto existente.
- `DELETE /produtos/{id}` - Remove um produto do sistema.

## ⚙️ Como executar a aplicação
1. Clone o repositório:
   `git clone https://github.com/SaimomFernandes/controle-estoque.git`
2. Certifique-se de ter o Maven instalado ou use o wrapper `./mvnw`.
3. Execute o comando:
   `mvn spring-boot:run`
4. Acesse a API via Postman ou Insomnia em: `http://localhost:8080/produtos`
5. Console do Banco H2: `http://localhost:8080/h2-console`

---Mauricio fernandes--- Desenvolvedor Full Stack Júnior.
