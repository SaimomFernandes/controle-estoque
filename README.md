
# 🚚 Projeto Controle de Estoque (Fullstack Java)
Este é um projeto paralelo desenvolvido para demonstrar competências como Desenvolvedor Fullstack Júnior. O sistema gerencia um estoque completo, utilizando relacionamentos entre produtos e categorias, com persistência em banco de dados real.

## 🚀 O que este projeto demonstra:
Domínio de Java & Spring Boot: Uso de rotas REST, Injeção de Dependências e JPA.
Banco de Dados Real: Migração do banco em memória (H2) para MySQL 8.
Infraestrutura como Código: Uso de Docker para padronizar o ambiente.
Segurança e Modernidade: Implementação de identificadores únicos via UUID.
Documentação Profissional: API documentada e testável via Swagger/OpenAPI.

## 🛠️ Tecnologias e Ferramentas
Backend: Java 17 / Spring Boot 3.x
Banco de Dados: MySQL 8
Persistência: Spring Data JPA / Hibernate
Containerização: Docker & Docker Compose
Documentação: Swagger UI (OpenAPI 3)
Produtividade: Lombok

## 📖 Documentação da API (Swagger)
A API conta com documentação interativa. Com a aplicação rodando, acesse:
👉 http://localhost:8080/swagger-ui/index.html
Lá você poderá testar todos os endpoints de Produtos e Categorias diretamente pelo navegador.

## 📋 Endpoints Principais
Recurso	Método	Rota	Descrição
Categoria	POST	/categorias	Cria uma nova categoria (Ex: Eletrônicos)
Categoria	GET	/categorias	Lista todas as categorias
Produto	POST	/produtos/create	Cadastra um produto vinculado a uma categoria
Produto	GET	/produtos/	Lista todos os produtos no estoque
Produto	GET	/produtos/{id}	Busca um produto específico pelo seu UUID
Produto	DELETE	/produtos/{id}	Remove um item do sistema

## ⚙️ Como executar a aplicação
Você não precisa ter o MySQL instalado localmente, apenas o Docker Desktop.
Clone o repositório:

bash
git clone https://github.com
Use o código com cuidado.
Suba o banco de dados via Docker:
No terminal, dentro da pasta do projeto:

bash
docker-compose up -d
Use o código com cuidado.
Execute o projeto Java:
Pela sua IDE ou via Maven:

bash
mvn spring-boot:run
Use o código com cuidado.

## Desenvolvido por Mauricio Fernandes
## Focado na transição de carreira para Tecnologia, construindo soluções sólidas entre uma viagem e outra como motorista de caminhão. 🛣️👨‍💻


---Mauricio fernandes--- Desenvolvedor Full Stack Júnior.
