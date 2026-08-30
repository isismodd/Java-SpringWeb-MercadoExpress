# MercadoExpress_CP04

[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.1.0-brightgreen)](https://spring.io/projects/spring-boot)
[![Java](https://img.shields.io/badge/Java-21-orange)](https://adoptium.net/)
[![Oracle](https://img.shields.io/badge/Oracle-Database-red)](https://www.oracle.com/br/database/)
[![Lombok](https://img.shields.io/badge/Lombok-1.18.30-purple)](https://projectlombok.org/)
[![HATEOAS](https://img.shields.io/badge/HATEOAS-Nível%203-blue)](https://restfulapi.net/hateoas/)

## Sobre o Projeto

Sistema de gestão para uma empresa do tipo **Mercado Express**. A aplicação implementa um CRUD completo (Create, Read, Update, Delete) para o gerenciamento de produtos, utilizando Spring Boot e integração com banco de dados Oracle.

O projeto foi desenvolvido seguindo os princípios do **HATEOAS (Nível 3 de Maturidade de Richardson)** e utiliza o **Lombok** para reduzir a verbosidade do código, garantindo um código mais limpo e manutenível.

---

## Tecnologias Utilizadas

### Backend
| Tecnologia | Versão | Descrição |
|------------|--------|-----------|
| **Java** | 21 | Linguagem de programação |
| **Spring Boot** | 4.1.0 | Framework principal |
| **Spring Data JPA** | 4.1.0 | Persistência com JPA/Hibernate |
| **Spring HATEOAS** | 4.1.0 | Implementação do Nível 3 de Richardson |
| **Spring Validation** | 4.1.0 | Validação de dados com Bean Validation |
| **Spring Web MVC** | 4.1.0 | API REST com Spring MVC |
| **Oracle JDBC** | 11.x | Conexão com Oracle Database |
| **Lombok** | 1.18.30 | Redução de código boilerplate |
| **SpringDoc OpenAPI** | 3.1.0 | Documentação da API (Swagger) |
| **Thymeleaf** | - | Template Engine para views |

### Ferramentas
- **Maven** - Gerenciamento de dependências
- **Oracle SQL Developer** - Gerenciamento do banco de dados
- **Git/GitHub** - Controle de versão
- **Render** - Hospedagem da aplicação

---

## Acessar a Aplicação

A aplicação está disponível online no Render. Para acessar qualquer recurso, você precisará se autenticar primeiro.

| Recurso | URL |
|---------|-----|
| **Interface Web** | [https://java-springweb-mercadoexpress.onrender.com](https://java-springweb-mercadoexpress.onrender.com) |
| **Swagger UI** | [https://java-springweb-mercadoexpress.onrender.com/swagger-ui.html](https://java-springweb-mercadoexpress.onrender.com/swagger-ui.html) |
| **API Docs** | [https://java-springweb-mercadoexpress.onrender.com/v3/api-docs](https://java-springweb-mercadoexpress.onrender.com/v3/api-docs) |

### Rotas Disponíveis

| Rota | Descrição |
|------|-----------|
| `/web/produtos` | Lista de produtos |
| `/web/produtos/novo` | Formulário para cadastrar produto |
| `/web/produtos/{id}` | Detalhes do produto |
| `/web/produtos/{id}/editar` | Editar produto |

---

### Funcionalidades e Telas

1. Tela de Login
Tela de autenticação para acesso seguro à aplicação.

<img width="800" alt="Login" src="https://github.com/user-attachments/assets/be959c92-bb64-478b-949f-856f6571d182" />

Funcionalidades:

Autenticação com Spring Security

Validação de credenciais

Redirecionamento após login

---

2. Página Home
Página inicial da aplicação com apresentação do sistema e navegação para as funcionalidades principais.

<img width="800" alt="Home" src="https://github.com/user-attachments/assets/4b117322-b9d0-4484-914e-32e7947bd62f" />


Funcionalidades:

Navegação para lista de produtos

Navegação para cadastro de produtos

Design responsivo com imagem de fundo

---

3. Lista de Produtos
Consulta e exibição de todos os produtos cadastrados no banco de dados.

<img width="800" alt="Lista de Produtos" src="https://github.com/user-attachments/assets/bf93bf19-1b74-40c6-9223-63607881651e" />

Funcionalidades:

Listagem de todos os produtos via GET /api/produtos

Dados consultados diretamente do banco Oracle

Botões de ação: Visualizar, Editar e Deletar

Atualização automática da lista após operações

Tecnologia utilizada:

Spring Data JPA para consulta ao banco de dados

Thymeleaf para renderização da tabela

---


4. Detalhes do Produto
Visualização detalhada de um produto específico.

<img width="800" alt="Detalhes do Produto" src="https://github.com/user-attachments/assets/a9773f82-d220-4d11-843b-c1ab4e470f39" />

Funcionalidades:

Busca de produto por ID via GET /api/produtos/{id}

Exibição de todas as informações do produto

Botões para Editar, Deletar e Voltar

---

5. Editar Produto
Atualização de informações de um produto existente.

<img width="800" alt="Editar Produto" src="https://github.com/user-attachments/assets/ae7cf705-9c05-4ea8-ac73-3eb3377f2b4b" />

Funcionalidades:

Carregamento dos dados atuais do produto

Validação dos campos obrigatórios

Atualização via PUT /api/produtos/{id}

---

6. Cadastrar Produto
Inserção de um novo produto no banco de dados.

<img width="800" alt="Cadastrar Produto" src="https://github.com/user-attachments/assets/39d140e9-5921-4743-8606-7cb666536c1a" />
Funcionalidades:

Formulário com validação de campos obrigatórios

Inserção via POST /api/produtos

Redirecionamento para lista após cadastro



