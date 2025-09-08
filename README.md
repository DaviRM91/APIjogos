 API de Catálogo de Jogos

Uma API RESTful desenvolvida em Java com Spring Boot para gerenciar uma coleção pessoal de jogos.

 Funcionalidades

 Cadastrar novos jogos
 Listar todos os jogos
 Buscar jogo por ID
 Atualizar informações de jogos
 Excluir jogos
 Filtrar por status de conclusão
 Filtrar por plataforma

 Tecnologias Utilizadas

- **Java 21**
- **Spring Boot 3.5.5**
- **Spring Data JPA**
- **H2 Database** (banco em memória)
- **Maven**
- **Postman** (para testes)

# Como Executar

# Pré-requisitos
- Java 21 ou superior
- Maven 3.6 ou superior
- Git

# Clone e Execução

1. **Clone o repositório**
   ```bash
   git clone https://github.com/seu-usuario/jogos-api.git
   cd jogos-api

# Execute a aplicação
   ```bash
   mvn spring-boot:run
   ```

 A aplicação estará disponível em `http://localhost:8080`.
 Acesse o console do H2 em `http://localhost:8080/h2-console` (usuário: `sa`, senha: 1234).
 
# Endpoints
- `POST /api/jogos` - Cadastrar um novo jogo
- `GET /api/jogos` - Listar todos os jogos
- `GET /api/jogos/{id}` - Buscar jogo por ID
- `PUT /api/jogos/{id}` - Atualizar informações de um jogo
- `DELETE /api/jogos/{id}` - Excluir um jogo

# Exemplos de Requisições
- **Cadastrar Jogo**

    ```json
    POST /api/jogos
    {
        {
  "id": "2",
  "titulo": "Red Dead Redemption 2",
  "genero": "Ação-Aventura",
  "plataforma": "PS4/XBOX One/PC",
  "desenvolvedora": "Rockstar Games",
  "anoLancamento": 2018,
  "nota": 9.7,
  "finalizado": false
}
    }
    ```
# Autor
- Davi Rodrigues - [DaviRM91]