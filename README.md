# Trabalho-com-MVC-
Neste projeto, eu fiz uma aplicação simples usando MVC sem front-end
Este projeto implementa uma aplicação simples utilizando o padrão MVC (Model–View–Controller) com Spring Boot, conforme solicitado no enunciado da atividade.
Aplicação simples em Spring Boot demonstrando padrão MVC (Model-View-Controller) sem front-end.
Entidade: **Tarefa** (CRUD via REST).

pom.xml
<dependencies>
    <!-- Web -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <!-- JPA + H2 Database -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>

    <dependency>
        <groupId>com.h2database</groupId>
        <artifactId>h2</artifactId>
        <scope>runtime</scope>
    </dependency>

    <!-- Testes -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>

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
```bash
git init
git add .
git commit -m "Entrega: trabalho-com-mvc-"
git branch -M main
git remote add origin https://github.com/exmo007/trabalho-com-mvc-
git push -u origin main
```
