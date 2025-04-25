# 📚 API de Livros e Editoras

Este projeto foi desenvolvido com **Spring Boot** e utiliza **MariaDB** como banco de dados, sendo gerenciado via **XAMPP**. A aplicação expõe uma API RESTful para cadastro e consulta de livros e editoras.

---

## 🛠️ Estrutura do Projeto

A arquitetura do projeto segue o padrão de camadas:

- **Model:** Contém as entidades `Livro` e `Editora`.
- **Repository:** Interfaces responsáveis pela comunicação com o banco de dados, usando Spring Data JPA.
- **Controller:** Camada responsável por receber e processar as requisições HTTP (REST API).

---

## 🔗 Relacionamento entre as Entidades

Foi implementado um relacionamento **Many-to-One** entre as entidades `Livro` e `Editora`:

- Uma **Editora** pode publicar **vários Livros**.
- Um **Livro** pertence a **uma única Editora**.

### 📄 Implementação no código

```java
// Na classe Livro.java
@ManyToOne
@JoinColumn(name = "editora_id")
@JsonBackReference
private Editora editora;
```
Com essa anotação, cada livro armazena a chave estrangeira editora_id, representando a editora a que pertence.

🔧 Configuração do Banco de Dados

No arquivo application.properties, configure o acesso ao banco de dados:
```java
spring.datasource.url=jdbc:mariadb://localhost:3306/samuelbanco
spring.datasource.username=samuelsouto
spring.datasource.password=12121853
spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MariaDBDialect
spring.devtools.restart.enabled=true
```
📌 Endpoints disponíveis:
📚 Livros
GET http://localhost:8080/livros — lista todos os livros

POST http://localhost:8080/livros — cria um novo livro

GET http://localhost:8080/livros/{id} — busca um livro pelo ID

PUT http://localhost:8080/livros/{id} — atualiza um livro pelo ID

DELETE http://localhost:8080/livros/{id} — deleta um livro pelo ID

🏢 Editoras
GET http://localhost:8080/editoras — lista todas as editoras

POST http://localhost:8080/editoras — cria uma nova editora

GET http://localhost:8080/editoras/{id} — (não aparece, mas você pode testar também)

PUT http://localhost:8080/editoras/{id} — atualiza uma editora

DELETE http://localhost:8080/editoras/{id} — deleta uma editora

🧪 Testes
Os endpoints da API foram testados com sucesso utilizando o Postman.

✅ Cadastro de livros
✅ Cadastro de editoras
✅ Listagem e busca de registros
✅ Relacionamento entre entidades funcionando corretamente

![image](https://github.com/user-attachments/assets/e52c42eb-c174-423e-8a8b-4b35bfb99ddc)
![image](https://github.com/user-attachments/assets/7d952ba8-c359-49ac-ad83-8ada0e7286f6)
![image](https://github.com/user-attachments/assets/417c2906-d75f-4f98-85e3-bc778d30f4a5)
