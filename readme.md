# Projeto em Arquitetura Hexagonal

## Descrição
Este é um projeto de exemplo utilizando arquitetura hexagonal com Spring Boot e diversas outras bibliotecas. A arquitetura hexagonal visa facilitar o isolamento e a testabilidade dos componentes de negócio, promovendo uma separação clara entre o núcleo de funcionalidades e suas dependências externas (banco de dados, interfaces de usuário, sistemas externos, etc.).

## Tecnologias Utilizadas
- **Java 21**
- **Spring Boot 3.3.4**
- **Spring Data MongoDB**: Para integração com banco de dados MongoDB.
- **Spring Boot Starter Validation**: Para validação de dados.
- **Spring Boot Starter Web**: Para criar APIs RESTful.
- **Spring Cloud OpenFeign**: Para chamadas de serviços remotos.
- **Spring Kafka**: Para trabalhar com Apache Kafka.
- **Lombok**: Para reduzir o código boilerplate.
- **MapStruct**: Para mapeamento de objetos.
- **JUnit 5**: Para testes unitários.
- **ArchUnit**: Para testes de arquitetura.

## Estrutura do Projeto
A arquitetura hexagonal divide o projeto em camadas claras e bem definidas:

1. **Domínio**: Contém as regras de negócio e é completamente independente de frameworks ou bibliotecas externas.
2. **Aplicação**: Orquestra as interações entre o domínio e o mundo exterior.
3. **Portas e Adaptadores**:
    - **Portas**: Interfaces que oferecem funcionalidades ao mundo exterior (ex.: controladores REST, interfaces gráficas).
    - **Adaptadores**: Implementações dessas interfaces (ex.: repositórios de dados, clientes de serviços externos).

## Configuração do Projeto

1. **Clone o repositório:**
   ```sh
   git clone https://github.com/RafaelJaber/arquitetura-hexagonal.git
   cd arquitetura-hexagonal
   ```

2. **Construa e Inicie o Projeto:**
   ```sh
   ./gradlew build
   ./gradlew bootRun
   ```

3. **Executar Testes:**
   ```sh
   ./gradlew test
   ```

## Endpoints da API

| Rota                                     | Descrição                           |
|------------------------------------------|-------------------------------------|
| <kbd>GET /api/v1/customers/{id}</kbd>    | Buscar o cliente informando o ID    |
| <kbd>POST /api/v1/customers</kbd>        | Realizar o cadastro de cliente      |
| <kbd>PUT /api/v1/customers/{id}</kbd>    | Atualizar o cliente informando o ID |
| <kbd>DELETE /api/v1/customers/{id}</kbd> | Deletar o cliente informando o ID   |
