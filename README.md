# Workshop github

Este projeto é uma aplicação Java desenvolvida com Spring Boot e JPA para gerenciar uma estrutura básica de comércio eletrônico. Ele contém entidades, repositórios, serviços e recursos necessários para operações CRUD e manipulação de dados relacionados a categorias, produtos, pedidos e usuários.

## Estrutura do Projeto

Abaixo está uma descrição dos principais pacotes e suas responsabilidades no projeto.

### 1. `config`

- **TesteConfig**: Configurações gerais do projeto, incluindo inicializações específicas necessárias para o funcionamento da aplicação.

### 2. `entities`

Este pacote contém as classes de entidade que representam os modelos de dados.

- **Category**: Representa uma categoria de produtos.
- **Order**: Representa um pedido realizado por um usuário.
- **OrderItem**: Item de um pedido, que possui uma quantidade e um produto associado.
- **Payment**: Informações sobre o pagamento de um pedido.
- **Product**: Representa um produto no sistema.
- **User**: Representa um usuário do sistema.
  
  **Subpacotes:**
  - **enums**: Enumerações utilizadas no sistema.
    - **OrderStatus**: Enum para representar os diferentes status de um pedido.
  - **pk**: Classes de chave primária composta.
    - **OrderItemPk**: Classe para a chave primária composta da entidade `OrderItem`.

### 3. `repositories`

Contém interfaces que estendem `JpaRepository` para comunicação com o banco de dados.

- **CategoryRepository**: Repositório para operações CRUD de `Category`.
- **OrderRepository**: Repositório para operações CRUD de `Order`.
- **OrderItemRepository**: Repositório para operações CRUD de `OrderItem`.
- **PaymentRepository**: Repositório para operações CRUD de `Payment`.
- **ProductRepository**: Repositório para operações CRUD de `Product`.
- **UserRepository**: Repositório para operações CRUD de `User`.

### 4. `resources`

Contém as classes REST Controllers que expõem os endpoints da API para cada entidade.

- **CategoryResource**: Controlador para manipular operações de categorias.
- **OrderResource**: Controlador para manipular operações de pedidos.
- **ProductResource**: Controlador para manipular operações de produtos.
- **UserResource**: Controlador para manipular operações de usuários.

#### Exceções

- **exceptions**: Define exceções personalizadas para tratamentos de erro específicos.
  - **DatabaseException**: Exceção para erros de banco de dados.
  - **ResourceNotFoundException**: Exceção para recursos não encontrados.

### 5. `services`

Contém as classes de serviço, onde a lógica de negócios é implementada.

- **CategoryServices**: Serviço para operações de categoria.
- **OrderServices**: Serviço para operações de pedido.
- **ProductServices**: Serviço para operações de produto.
- **UserServices**: Serviço para operações de usuário.

#### Exceções

- **exceptions**: Define exceções específicas para a camada de serviço.
  - **DatabaseException**: Exceção para problemas específicos com banco de dados.
  - **ResourceNotFoundException**: Exceção lançada quando um recurso solicitado não é encontrado.

### 6. `SpringbootjpaApplication`

A classe principal da aplicação, contendo o método `main` que inicia o aplicativo Spring Boot.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal.
- **Spring Boot**: Framework para facilitar a criação e gerenciamento da aplicação.
- **Spring Data JPA**: Integração do JPA com Spring para operações de banco de dados.
- **H2 Database**: Banco de dados em memória para facilitar o desenvolvimento e testes.
- **Maven**: Gerenciamento de dependências e build.

## Como Executar

1. Clone este repositório.
2. Importe o projeto em sua IDE preferida.
3. Certifique-se de que o Maven está configurado.
4. Execute a classe `SpringbootjpaApplication`.
5. Acesse os endpoints REST através de um cliente como Postman ou diretamente pelo navegador.

## Estrutura de Endpoints

- **/categories**: Operações para categorias.
- **/orders**: Operações para pedidos.
- **/products**: Operações para produtos.
- **/users**: Operações para usuários.

## Tratamento de Erros

O projeto inclui uma estrutura de tratamento de erros com exceções específicas para erros de banco de dados e recursos não encontrados. As exceções são manipuladas para retornar respostas apropriadas ao cliente.

