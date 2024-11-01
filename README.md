# Spring Boot Microservices Application

This project demonstrates a Spring Boot application using a microservices architecture with two main services: `UserService` and `ContactService`. The services communicate with each other through an `Eureka Server`, which acts as a service registry. An API Gateway is used to handle external requests and route them to the appropriate services.

## Project Architecture

- **UserService**: Manages user-related operations.
- **ContactService**: Manages contact-related operations.
- **Eureka Server**: Service registry for registering and discovering microservices.
- **API Gateway**: Routes requests to appropriate services and enables centralized authentication, logging, and other cross-cutting concerns.

## Tech Stack

- **Java 17**: Language used.
- **Spring Boot 3.x**: Framework for building microservices.
- **Spring Cloud Eureka**: Service registry for microservices discovery.
- **Spring Cloud Gateway**: Acts as an API gateway for routing requests.
- **Spring Data JPA**: Manages database access.
- **H2 Database**: In-memory database for quick testing and development.
- **Maven**: Build and dependency management tool.

## Getting Started

### Prerequisites

- **Java 17**
- **Maven**
- **Docker** (optional for containerization)

### Modules

1. **Eureka Server**
2. **API Gateway**
3. **UserService**
4. **ContactService**

### Configuration

Ensure you have the following configurations in each service:

1. **Eureka Server** - Set up as a Spring Boot application with the `@EnableEurekaServer` annotation.
   
   ```yaml
   # src/main/resources/application.yml
   server:
     port: 8761

   eureka:
     client:
       register-with-eureka: false
       fetch-registry: false
     instance:
       hostname: localhost
   ```

2. **UserService and ContactService** - Enable Eureka client in both services with the `@EnableEurekaClient` annotation.

   ```yaml
   # src/main/resources/application.yml
   eureka:
     client:
       service-url:
         defaultZone: http://localhost:8761/eureka/
   ```

3. **API Gateway** - Set up routing for each service in `application.yml`.

   ```yaml
   # src/main/resources/application.yml
   server:
     port: 8080

   spring:
     application:
       name: api-gateway
     cloud:
       gateway:
         routes:
           - id: user-service
             uri: lb://USER-SERVICE
             predicates:
               - Path=/user/**
           - id: contact-service
             uri: lb://CONTACT-SERVICE
             predicates:
               - Path=/contact/**
   ```

### Run the Application

1. **Start Eureka Server**:

   ```bash
   cd eureka-server
   mvn spring-boot:run
   ```

2. **Start UserService**:

   ```bash
   cd user-service
   mvn spring-boot:run
   ```

3. **Start ContactService**:

   ```bash
   cd contact-service
   mvn spring-boot:run
   ```

4. **Start API Gateway**:

   ```bash
   cd api-gateway
   mvn spring-boot:run
   ```

### Testing

You can access the API Gateway endpoints to interact with the microservices:

- **UserService**: `http://localhost:8080/user/**`
- **ContactService**: `http://localhost:8080/contact/**`
- **Eureka Dashboard**: `http://localhost:8761`

## Communication Between Services

The services are set up to communicate through **REST API calls**. For instance, `UserService` can fetch contact information from `ContactService` through REST endpoints, using service discovery to locate `ContactService` via Eureka.

### Sample Endpoint

- To get a user along with contact details:

   ```http
   GET http://localhost:8080/user/{userId}/contacts
   ```

## Docker (Optional)

You can containerize each service using Docker for deployment. Below is a sample `Dockerfile`:

```Dockerfile
# Dockerfile
FROM openjdk:17-jdk-slim
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
```

Use Docker Compose to orchestrate the containers for all services.

---

## License

This project is licensed under the MIT License.

---


