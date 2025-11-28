# Trabalho: Aplicação MVC com Spring Boot

Este repositório contém a implementação de uma aplicação simples utilizando o padrão MVC (Model–View–Controller) com Spring Boot, conforme solicitado na atividade.

A aplicação não possui front-end e expõe endpoints REST para manipulação de uma entidade simples: **Tarefa**.

---

## Tecnologias utilizadas

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- Banco de dados em memória **H2**
- Maven
- JUnit / Spring Boot Test

---

## Estrutura do Projeto

/Projeto MVC
 ├── src
 │   ├── main
 │   │   ├── java
 │   │   │   └── com/Projeto MVC/...
 │   │   └── resources
 │   │       └── application.properties
 │   └── test
 ├── pom.xml
 ├── .gitignore
 └── README.md

yaml
Copiar código

---

## Endpoints REST

| Método | Endpoint           | Descrição                      |
|--------|--------------------|--------------------------------|
| POST   | `/tarefas`         | Criar uma nova tarefa          |
| GET    | `/tarefas`         | Listar todas as tarefas        |
| PUT    | `/tarefas/{id}`    | Atualizar tarefa existente     |
| DELETE | `/tarefas/{id}`    | Deletar uma tarefa             |

---

## Banco de Dados H2

O H2 é carregado automaticamente em memória.  
Console disponível em:

http://localhost:8080/h2-console

yaml
Copiar código

Configurações padrão podem ser encontradas em `application.properties`.

---

## Testes

Foram criados testes unitários e testes de integração utilizando:

- `SpringBootTest`
- `MockMvc`
- `JUnit`

---

## Como executar o projeto

mvn spring-boot:run

yaml
Copiar código

Ou rodar a classe principal pela IDE.

---

## Comandos Git utilizados

git init
git add .
git commit -m "Primeiro commit - Projeto Spring MVC"
git branch -M main
git remote add origin https://github.com/exmo007/Trabalho-com-MVC-
git push -u origin main

yaml
Copiar código

---

## Arquivos ignorados (.gitignore)

Maven
target/
*.log

IDEs
.idea/
*.iml
.vscode/
.classpath
.project
.settings/

Sistema operacional
.DS_Store
Thumbs.db

yaml
Copiar código

---

Se tiver dúvidas ou quiser melhorar o projeto, posso ajudar! 😊
