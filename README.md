📚 Projeto: API de Livros e Editoras
Este projeto é uma API REST desenvolvida em Spring Boot com persistência de dados em MariaDB (XAMPP), permitindo o gerenciamento de livros e editoras.

🚀 Tecnologias Utilizadas
Java 17+

Spring Boot

Spring Data JPA

Lombok

MariaDB (via XAMPP)

Maven
⚙️ Como rodar o projeto
Clone o repositório:

bash
Copy
Edit
git clone https://github.com/seu-usuario/seu-repositorio.git
cd seu-repositorio
Configure o banco de dados:

No seu XAMPP (MariaDB), crie o banco chamado:

nginx
Copy
Edit
provaMariaDB
Configure o application.properties:

Exemplo de configuração:

properties
Copy
Edit
spring.datasource.url=jdbc:mariadb://localhost:3306/provaMariaDB
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
Execute o projeto:

Pelo terminal:

bash
Copy
Edit
./mvnw spring-boot:run
Ou diretamente pela sua IDE (ex: VSCode, IntelliJ).

📖 Endpoints Disponíveis
📚 Livros (/livros)
GET /livros — Lista todos os livros

POST /livros — Cria um novo livro

PUT /livros/{id} — Atualiza um livro existente

DELETE /livros/{id} — Deleta um livro pelo ID

🏢 Editoras (/editoras)
GET /editoras — Lista todas as editoras

POST /editoras — Cria uma nova editora

PUT /editoras/{id} — Atualiza uma editora existente

DELETE /editoras/{id} — Deleta uma editora pelo ID

🛠 Estrutura do Projeto
css
Copy
Edit
src
 └── main
     └── java
         └── com.example.demo
             ├── controller
             │   ├── LivroController.java
             │   └── EditoraController.java
             ├── model
             │   ├── Livro.java
             │   └── Editora.java
             ├── repository
             │   ├── LivroRepository.java
             │   └── EditoraRepository.java
             └── DemoApplication.java
