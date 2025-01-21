
# Catálogo de Livros
[![Java](https://img.shields.io/badge/Java-21-blue)](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.1-brightgreen)](https://spring.io/projects/spring-boot)

## Descrição

O **Catálogo de Livros** é uma aplicação desenvolvida para gerenciar um repositório de livros, permitindo buscas por título, listagens de livros e autores, e muito mais. A aplicação é construída usando Java e Spring Boot, fornecendo uma interface de linha de comando (CLI) para interações com o usuário.

## Funcionalidades

- **Buscar Livros por Título:** Localize livros usando parte ou todo o título.
- **Listar Livros Registrados:** Veja todos os livros disponíveis no catálogo.
- **Gerenciamento de Autores:** Integração futura para listar e gerenciar autores.
- **Filtragem por Idioma:** Encontre livros específicos em um idioma escolhido.

## Tecnologias Usadas

- **Java 21**
- **Spring Boot 3.4.1**
- **Spring Data JPA** para gerenciamento e persistência dos dados
- **H2/PostgreSQL** para banco de dados (comutável conforme configuração)
- **Lombok** para redução de boilerplate no código Java

## Instalação

### Pré-requisitos

- **Java 21+**: Aplique a instalação no seu sistema.
- **Maven 3.8+**: Assegure-se que o Maven está configurado no PATH.

### Passos para Configurar Localmente

1. Clone este repositório para sua máquina.
    ```bash
    git clone https://github.com/Otair-Caetano/Catalago_livros.git
    cd Catalago_livros
    ```

2. Atualize suas configurações no `application.properties`.
    ```properties
    #src/main/resources/application.properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/catalogo_livros
    spring.datasource.username=seu_usuario
    spring.datasource.password=sua_senha
    ```

3. Compile e execute o projeto usando Maven.
    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

## Como Usar

- Inicie a aplicação no terminal com `mvn spring-boot:run`.
- Use o menu interativo para explorar recursos do catálogo de livros.

## Contribuindo

1. **Fork o Projeto** no GitHub.
2. **Clone** o seu fork no seu ambiente local.
3. Crie uma **Branch** para sua feature (`git checkout -b feature/sua-feature`).
4. **Commit** suas mudanças (`git commit -m "Adiciona nova feature..."`).
5. **Push** para o branch criado (`git push origin feature/sua-feature`).
6. **Abra um Pull Request**.

## Licença

Este projeto está licenciado sob [MIT License](LICENSE).

## Contato

Se tiver dúvidas ou sugestões, entre em contato com [Otair Caetano](https://github.com/Otair-Caetano).

