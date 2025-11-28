<<<<<<< HEAD
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
git commit -m "Primeiro commit - Trabalho-com-MVC-"
git branch -M main
git remote add origin https://github.com/exmo007/Trabalho-com-MVC-.git
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
=======
# trabalho-spring-mvc

Aplicação simples em Spring Boot demonstrando padrão MVC (Model-View-Controller) sem front-end.
Entidade: **Tarefa** (CRUD via REST).

## Estrutura principal
- `model` - Entidade JPA `Tarefa`
- `repository` - `TarefaRepository` (JpaRepository)
- `service` - `TarefaService` (lógica de negócios)
- `controller` - `TarefaController` (endpoints REST)

## Dependências
- Spring Boot Web
- Spring Data JPA
- H2 (in-memory)
- Spring Boot Test (testes)

## Executando localmente
Recomendado: JDK 17 e Maven

```bash
# compilar e rodar
mvn clean spring-boot:run
# ou empacotar e executar
mvn clean package
java -jar target/trabalho-spring-mvc-0.0.1-SNAPSHOT.jar
```

A API ficará disponível em http://localhost:8080/tarefas

### Exemplos de uso (curl)
Criar:
```
curl -X POST http://localhost:8080/tarefas -H "Content-Type: application/json" -d '{"descricao":"Estudar Spring","status":"PENDENTE"}'
```
Listar:
```
curl http://localhost:8080/tarefas
```

## Testes
Para executar os testes:
```
mvn test
```

## Publicando no Git (exemplo com GitHub)
1. Crie um repositório no GitHub (ex.: `trabalho-spring-mvc`).
2. Do diretório do projeto local, rode:
```bash
git init
git add .
git commit -m "Entrega: trabalho-spring-mvc"
git branch -M main
git remote add origin https://github.com/<seu-usuario>/trabalho-spring-mvc.git
git push -u origin main
```

Substitua `<seu-usuario>` pelo seu usuário GitHub.

---
Arquivo gerado automaticamente para entrega do trabalho (H2 + testes).
>>>>>>> a17bb98 (Primeiro commit - Trabalho-com-MVC-)
