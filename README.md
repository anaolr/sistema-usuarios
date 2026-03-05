# Sistema de Cadastro de Usuários

Projeto desenvolvido para estudar **Spring Boot, APIs REST e integração entre back-end e front-end**.

A aplicação permite **cadastrar usuários e listar os usuários registrados**, utilizando uma API construída em **Java com Spring Boot** e um front-end simples em **HTML, CSS e JavaScript** que consome essa API.

Este foi meu **primeiro contato com desenvolvimento back-end e criação de APIs**, explorando o fluxo completo de uma aplicação web.

---

## Demonstração do funcionamento

A aplicação possui duas funcionalidades principais:

- Cadastro de usuários
- Listagem de usuários cadastrados

O front-end envia uma requisição **POST** para a API para salvar um usuário no banco de dados e utiliza uma requisição **GET** para buscar todos os usuários cadastrados.

Fluxo da aplicação:

Front-end (HTML + JS)  
↓  
Requisição HTTP (fetch API)  
↓  
API REST (Spring Boot)  
↓  
Service  
↓  
Repository (Spring Data JPA)  
↓  
Banco de dados MySQL  

---

## Tecnologias utilizadas

### Back-end

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Maven

### Front-end

- HTML
- CSS
- JavaScript
- Fetch API

---

## Estrutura do projeto

O back-end segue uma arquitetura simples baseada em camadas:

**controller**  
Responsável por receber as requisições HTTP da aplicação.

**service**  
Contém a lógica da aplicação e intermedia a comunicação com o repositório.

**repository**  
Responsável pela comunicação com o banco de dados utilizando **Spring Data JPA**.

**model**  
Representa a entidade `Usuario`, que é mapeada para uma tabela no banco de dados.

---

## Endpoints da API

### GET /usuarios

Retorna a lista de todos os usuários cadastrados.

### POST /usuarios

Cadastra um novo usuário no banco de dados.

Exemplo de JSON enviado:

```json
{
  "nome": "Ana",
  "email": "ana@email.com",
  "senha": "123456"
}
```

---

## Integração com o Front-end

O front-end utiliza **JavaScript e Fetch API** para se comunicar com o back-end.

Exemplo de requisição para cadastro de usuário:

```javascript
fetch("http://localhost:8080/usuarios", {
  method: "POST",
  headers: {
    "Content-Type": "application/json"
  },
  body: JSON.stringify(usuario)
})
```

Após o cadastro, o sistema busca novamente os usuários para atualizar a lista exibida na interface.

---

## Banco de dados

A aplicação utiliza **MySQL** para armazenar os usuários cadastrados.

A entidade `Usuario` possui os seguintes campos:

- id
- nome
- email
- senha

---

## O que aprendi com esse projeto

Durante o desenvolvimento deste projeto eu aprendi:

- Como criar uma **API REST com Spring Boot**
- Estrutura básica de uma aplicação back-end
- Integração entre **front-end e back-end**
- Como utilizar **Spring Data JPA**
- Comunicação com banco de dados MySQL
- Consumo de API utilizando **fetch no JavaScript**
- Estrutura em camadas (**Controller → Service → Repository**)

---

## Possíveis melhorias

Algumas melhorias que podem ser implementadas no futuro:

- Validação de dados
- Criptografia de senha
- Atualização de usuários
- Exclusão de usuários
- Interface mais elaborada
- Deploy da aplicação
