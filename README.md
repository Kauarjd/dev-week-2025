# API de Agendamento de Reservas

Este projeto é uma API RESTful desenvolvida em Spring Boot 3.4.3 e Java 17, projetada para gerenciar reservas em um sistema de agendamento. A API está hospedada no Railway e utiliza um banco de dados PostgreSQL para persistência de dados. A documentação da API é gerada automaticamente pelo SpringDoc OpenAPI (Swagger).

# 🛠 Tecnologias Utilizadas
Spring Boot 3.4.3

Java 17

PostgreSQL (Banco de dados)

Spring Data JPA (Persistência de dados)

SpringDoc OpenAPI (Documentação da API)

Railway (Hospedagem e deploy)

## 📊 Diagrama de Entidades
Abaixo está o diagrama de entidades do projeto, que ilustra as tabelas do banco de dados e seus relacionamentos:



```mermaid
erDiagram
    USER ||--o{ EMAIL : "possui"
    USER ||--o{ ADDRESS : "possui"
    USER ||--o{ ACCESS_HISTORY : "registra"
    USER ||--o{ AUTENTICACAO : "autentica"
    USER ||--o{ PROFILE : "pertence"
    USER {
        Long id
        String name
        String cpf
        Date birthDate
        Date registerDate
    }
    EMAIL {
        Long id
        String address
        Boolean main
        Boolean bureau
    }
    ADDRESS {
        Long id
        String country
        String state
        String city
        String postalCode
    }
    ACCESS_HISTORY {
        Long id
        Date dateTime
    }
    AUTENTICACAO {
        Long id
        String passHash
        String token
        Date expireDate
    }
    PROFILE {
        Long id
        String type
    }
```


## Imagens da aplicação:

![Image](https://github.com/user-attachments/assets/e1ab2007-a324-45f3-a1dd-8a15d15f9150)
![Image](https://github.com/user-attachments/assets/81cdbba8-076a-4ad9-81dc-c8d2c03d1641)
![Image](https://github.com/user-attachments/assets/e779aac1-3a9f-487e-9862-d32fe2c6551a)
![Image](https://github.com/user-attachments/assets/66a7aa47-0679-4516-8316-750ba21333a4)
