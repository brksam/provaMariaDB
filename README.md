# 📚 API de Livros e Editoras

Projeto desenvolvido em **Spring Boot** com banco de dados **MariaDB** usando o **XAMPP**.

---

## 🛠 Estrutura do Projeto

O projeto foi organizado seguindo a arquitetura em camadas:

- **Model:** Contém as entidades `Livro` e `Editora`.
- **Repository:** Interfaces de acesso ao banco de dados.
- **Controller:** Responsável pelo recebimento das requisições HTTP.

---

## 🔗 Relacionamento entre as Entidades

Foi implementado um relacionamento **Many-to-One** entre `Livro` e `Editora`, onde:

- Um **Livro** pertence a uma única **Editora**.
- Uma **Editora** pode ter vários **Livros**.

### 📄 Implementação

Na classe `Livro`:

```java
@ManyToOne
@JoinColumn(name = "editora_id")
private Editora editora;
Assim, cada livro fica associado a uma editora através da chave estrangeira editora_id.
