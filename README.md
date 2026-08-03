# CDC Synchronization Engine

## Overview

The CDC Synchronization Engine is an enterprise-level Spring Boot application that captures database changes using Change Data Capture (CDC) with Debezium, publishes events to Apache Kafka, processes them through Kafka Consumers, and synchronizes data across different systems. The project also includes JWT Authentication, Redis caching, Elasticsearch integration, monitoring, and Docker support.

---

## Features

- JWT Authentication & Authorization
- Spring Security
- Role-Based Access Control (ADMIN / OPERATOR)
- PostgreSQL Database
- Spring Data JPA
- Apache Kafka Producer & Consumers
- Manual Kafka Acknowledgement
- Dead Letter Queue (DLQ)
- Retry Mechanism
- Debezium CDC Integration
- Kafka Connect Configuration
- Redis Cache
- Elasticsearch Synchronization
- Audit Logging
- Process Status Tracking
- Global Exception Handling
- Correlation ID Filter
- Swagger/OpenAPI Documentation
- Micrometer Monitoring
- Prometheus Metrics
- Docker & Docker Compose Support
- Testcontainers Integration

---

## Technology Stack

| Technology | Version |
|------------|---------|
| Java | 21 |
| Spring Boot | 3.x |
| Spring Security | Latest |
| PostgreSQL | 17 |
| Apache Kafka | Latest |
| Debezium | 2.7 |
| Redis | 7 |
| Elasticsearch | 8.x |
| Docker | Latest |
| Maven | 3.x |

---

## Project Structure

```
cdc-synchronization-engine
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example.cdc
│   │   │        ├── config
│   │   │        ├── controller
│   │   │        ├── dto
│   │   │        ├── entity
│   │   │        ├── exception
│   │   │        ├── kafka
│   │   │        │    ├── consumer
│   │   │        │    ├── producer
│   │   │        │    ├── dlq
│   │   │        │    └── retry
│   │   │        ├── repository
│   │   │        ├── security
│   │   │        ├── service
│   │   │        └── tracing
│   │   │
│   │   └── resources
│   │        ├── application.properties
│   │        └── connector.json
│   │
│   └── test
│
├── Dockerfile
├── docker-compose.yml
├── pom.xml
└── README.md
```

---

## Architecture

```
Client
   │
   ▼
Spring Boot API
   │
   ▼
JWT Authentication
   │
   ▼
PostgreSQL
   │
   ▼
Debezium
   │
   ▼
Kafka Connect
   │
   ▼
Kafka Topics
   │
   ▼
Kafka Consumers
   │
   ▼
Sync Service
   │
   ├── Redis
   ├── Elasticsearch
   ├── Process Status
   └── Audit Log
```

---

## API Endpoints

### Authentication

| Method | Endpoint |
|--------|----------|
| POST | /auth/login |

### Synchronization

| Method | Endpoint |
|--------|----------|
| GET | /sync/status |
| GET | /failed-events |

### Kafka

| Method | Endpoint |
|--------|----------|
| POST | /kafka/order?message=OrderCreated |

### Monitoring

| Endpoint |
|----------|
| /swagger-ui/index.html |
| /actuator |
| /actuator/health |
| /actuator/prometheus |

---

## Security

- Spring Security
- JWT Authentication
- Stateless Session
- Role-Based Authorization

Roles:

- ADMIN
- OPERATOR

---

## Kafka Topics

- orders
- products
- customers
- inventory
- cdc-retry
- cdc-dlq

---

## Database Tables

- users
- sync_event
- process_status
- failed_event
- audit_log

---

## Build & Run

### Clone Repository

```bash
git clone https://github.com/your-username/cdc-synchronization-engine.git
```

### Build Project

```bash
mvn clean install
```

### Run Spring Boot

```bash
mvn spring-boot:run
```

---

## Docker

Start all services:

```bash
docker compose up -d
```

Services:

- PostgreSQL
- Kafka
- Zookeeper
- Debezium
- Redis
- Elasticsearch
- Kibana
- Spring Boot Application

---

## Testing

Run Tests

```bash
mvn test
```

---

## Monitoring

Swagger

```
http://localhost:8080/swagger-ui/index.html
```

Actuator

```
http://localhost:8080/actuator
```

Prometheus

```
http://localhost:8080/actuator/prometheus
```

---

## Future Enhancements

- Grafana Dashboard
- Kubernetes Deployment
- CI/CD Pipeline
- Email Notifications
- Multi-Region Synchronization

---

## Learning Outcomes

- Spring Boot Enterprise Development
- JWT Authentication
- Spring Security
- Event-Driven Architecture
- Apache Kafka
- Debezium CDC
- Redis
- Elasticsearch
- Docker
- Monitoring with Micrometer & Prometheus

---

## Author

**Swathi Palla**

Java Developer

---

## License

This project is developed for learning and demonstration purposes.
