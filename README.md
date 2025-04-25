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
Certifique-se de que os serviços Apache e MySQL estejam ativos no XAMPP.

No arquivo application.properties, configure o acesso ao banco de dados:
```java
spring.datasource.url=jdbc:mariadb://localhost:3306/nome_do_banco
spring.datasource.username=root
spring.datasource.password=
spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MariaDBDialect
```

💡 Substitua nome_do_banco pelo nome criado no phpMyAdmin.

🧪 Testes
Os endpoints da API foram testados com sucesso utilizando o Postman.

✅ Cadastro de livros

✅ Cadastro de editoras

✅ Listagem e busca de registros

✅ Relacionamento entre entidades funcionando corretamente

![image](https://github.com/user-attachments/assets/e52c42eb-c174-423e-8a8b-4b35bfb99ddc)
![image](https://github.com/user-attachments/assets/7d952ba8-c359-49ac-ad83-8ada0e7286f6)
![image](https://github.com/user-attachments/assets/417c2906-d75f-4f98-85e3-bc778d30f4a5)
