# 📚 API de Livros e Editoras

Este projeto é uma API REST desenvolvida em **Spring Boot** e persistência em **MariaDB** utilizando o **XAMPP** como ambiente de banco de dados.

---

## 🛠 Estrutura do Projeto

O projeto foi estruturado em camadas, seguindo a arquitetura padrão de aplicações Spring Boot:

- **Model:** Contém as classes de entidade (Livro e Editora).
- **Repository:** Contém as interfaces que fazem a comunicação com o banco de dados utilizando o Spring Data JPA.
- **Controller:** Contém as classes responsáveis por receber as requisições HTTP e interagir com as camadas de serviço e repositório.
- **Application:** Classe principal que inicializa a aplicação Spring Boot.

src 
  └── main 
   └── java 
     └── com.example.demo 
     ├── controller            
         ├── LivroController.java │ 
         └── EditoraController.java 
     ├── model │ 
         ├── Livro.java │ 
         └── Editora.java 
     ├── repository │ 
         ├── LivroRepository.java │ 
         └── EditoraRepository.java 
     └── DemoApplication.java
     
---

## 🔗 Relacionamento entre Entidades

Foi implementado um relacionamento do tipo **Many-to-One** entre as entidades **Livro** e **Editora**, ou seja:

- Cada **Livro** pertence a **uma única Editora**.
- Uma **Editora** pode ter **vários Livros** associados a ela.

### 📄 Implementação no Código

#### Entidade `Livro`

```java
@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String autor;

    @ManyToOne
    @JoinColumn(name = "editora_id")
    private Editora editora;

    // getters e setters
}
#### Entidade `Editora`
@Entity
public class Editora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    // getters e setters
}
Na entidade Livro, foi usado a anotação @ManyToOne para indicar que vários livros podem estar ligados a uma única editora.

O @JoinColumn(name = "editora_id") cria a chave estrangeira no banco de dados, associando um livro a uma editora.

📚 Funcionalidades
Cadastro de Livros e Editoras.

Atualização, listagem e remoção de Livros e Editoras.

Associação de Livros a uma Editora na criação ou atualização.

⚙️ Como Rodar o Projeto
Clone o repositório:
git clone https://github.com/seu-usuario/seu-repositorio.git
cd seu-repositorio
Configure o Banco de Dados:

Crie o banco de dados provaMariaDB no seu XAMPP (MariaDB).

Configure o arquivo application.properties:

properties
Copy
Edit
spring.datasource.url=jdbc:mariadb://localhost:3306/provaMariaDB
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
Execute a aplicação:

bash
Copy
Edit
./mvnw spring-boot:run
Ou pela sua IDE (Eclipse, IntelliJ, VSCode).

🎯 Endpoints Principais
Livros (/livros)
GET /livros — Lista todos os livros

POST /livros — Cria um novo livro

PUT /livros/{id} — Atualiza um livro existente

DELETE /livros/{id} — Remove um livro

Editoras (/editoras)
GET /editoras — Lista todas as editoras

POST /editoras — Cria uma nova editora

PUT /editoras/{id} — Atualiza uma editora existente

DELETE /editoras/{id} — Remove uma editora

✅ Observações Finais
O projeto foi desenvolvido utilizando apenas XAMPP como servidor de banco de dados (MariaDB).

Não foi utilizado Swagger para documentação dos endpoints.

As tabelas e relacionamentos são gerados automaticamente via JPA.
