# SGP API - Sistema de Gestão de Projetos (Back-end)

Este repositório contém a API do **Sistema de Gestão de Projetos (SGP)**, desenvolvida em **Java com Spring Boot** para fornecer uma arquitetura robusta, escalável e segura.  
O objetivo é oferecer todos os serviços necessários para o funcionamento do [SGP Front-end](https://github.com/CleytonW/sgp-js), permitindo o gerenciamento de projetos, equipes e tarefas.

---

## Tecnologias e Ferramentas

- **Java 17** — Linguagem principal do projeto.
- **Spring Boot 3** — Framework para construção da API.
- **Spring Web** — Criação de endpoints RESTful.
- **Spring Data JPA** — Persistência de dados e mapeamento objeto-relacional.
- **Spring Validation** — Validações de dados de entrada.
- **MySQL** — Banco de dados relacional.
- **Jackson Datatype JSR310** — Suporte para tipos de data e hora do Java 8+.
- **Lombok** — Redução de código boilerplate.
- **DevTools** — Hot reload para agilizar o desenvolvimento.
- **Maven** — Gerenciamento de dependências e build.

---

## Funcionalidades

- Estrutura de API RESTful para operações CRUD.
- Integração com **MySQL** para armazenamento persistente.
- Suporte a **validações de dados** para garantir integridade.
- Configuração de **entidades e repositórios JPA** para fácil manipulação do banco.
- Preparado para integração direta com o **front-end**.

---

## Estrutura do Projeto

sgp-api/
├── src/main/java/com/sgp/api
│ ├── controller/ # Endpoints da API
│ ├── model/ # Entidades JPA
│ ├── repository/ # Interfaces de acesso ao banco
│ ├── service/ # Lógica de negócios
│ └── dto/ # Objetos de transferência de dados
├── src/main/resources/
│ ├── application.properties # Configurações do banco e ambiente
└── pom.xml # Dependências Maven

yaml
Copiar
Editar

---

## Pré-requisitos

- **Java 17** ou superior instalado.
- **Maven** instalado.
- **MySQL** configurado e rodando.

---

## Configuração do Ambiente

1. **Clone o repositório**
   ```bash
   git clone https://github.com/CleytonW/sgp-api.git
Configure o banco de dados no arquivo src/main/resources/application.properties:

properties
Copiar
Editar
spring.datasource.url=jdbc:mysql://localhost:3306/sgp
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
Instale as dependências

bash
Copiar
Editar
mvn install
Execute o projeto

bash
Copiar
Editar
mvn spring-boot:run
A API estará disponível em:

arduino
Copiar
Editar
http://localhost:8080
Integração com o Front-end
O SGP API foi desenvolvido para trabalhar em conjunto com o front-end SGP JS.
Essa integração permite que as operações sejam feitas via interface gráfica, mantendo a comunicação via JSON.

Próximos Passos
Implementar autenticação e autorização (Spring Security + JWT).

Adicionar testes automatizados.

Criar documentação da API (Swagger/OpenAPI).

Autor:

[**Cleyton Melo**](https://github.com/CleytonW)