# JavaChallenge_2024
Desafio WIT - Gabriel Tanaka

# Calculadora REST API

Este projeto é uma API RESTful que fornece operações básicas de uma calculadora (soma, subtração, multiplicação e divisão) com suporte para números decimais de precisão arbitrária. A API foi desenvolvida em Java utilizando Spring Boot e Apache Kafka para comunicação entre módulos.

---

## Requisitos

- **Java 17**: Certifique-se de ter o JDK 17 instalado.
- **Maven**: Para gerenciamento de dependências e build do projeto.
- **Docker**: Para rodar os contêineres da aplicação e do Kafka.
- **Git**: Para clonar o repositório.

---

## Como Rodar o Projeto

### 1. Clone o Repositório

```bash
git clone https://github.com/GabrielYYTanaka/JavaChallenge_2024
cd calculator
```

### 2. Construa o projeto

```bash
mvn clean install
```

### 3. Execute com Docker Compose

```bash
docker-compose up --build
```

### 4. Acesse a API

A API estará disponível em http://localhost:8080/calculator. Aqui estão os endpoints disponíveis:

### Soma:

```bash
GET /calculator/soma?a=10&b=5
Resposta: 15
```

### Subtração:

```bash
GET /calculator/subtracao?a=10&b=5
Resposta: 5
```

### Multiplicação:

```bash
GET /calculator/multiplicacao?a=10&b=5
Resposta: 50
```

### Divisão:

```bash
GET /calculator/divisao?a=10&b=5
Resposta: 2
```