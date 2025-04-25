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
🧪 Testes e Print
>✅ Os testes foram realizados com sucesso via Postman.
>✅ Endpoints funcionam corretamente.

![image](https://github.com/user-attachments/assets/01b93ec5-c86a-4a35-9d21-1143cfb6f937)
![image](https://github.com/user-attachments/assets/7d952ba8-c359-49ac-ad83-8ada0e7286f6)
![image](https://github.com/user-attachments/assets/417c2906-d75f-4f98-85e3-bc778d30f4a5)



