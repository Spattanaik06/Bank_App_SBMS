# 🏦 Banking Application - Spring Boot Microservices Project

  A full-fledged Banking Application built using Spring Boot Microservices architecture.
  It provides secure banking features like Account Management, Transactions, Loan Processing, and Notifications, with JWT Authentication and Kafka Messaging.

🚀 Features
--------------

 * Authentication Service: Login, Registration, JWT Token Issuance
  
  * User Service: User profile management and role-based access (Admin, Customer, Employee)
  
  * Account Service: Open accounts, view balance
  
 *  Transaction Service: Deposit, Withdraw, Fund Transfers
  
 *  Loan Service: Loan Applications and Approval Workflow
  
  * Notification Service: Email/SMS Notifications (via Kafka events)
  
 * API Gateway: Request Routing + JWT Token Validation
  
  * Eureka Discovery Server: Service Registration and Discovery
  
 *  Config Server: Centralized Configuration Management
  
 *  Zipkin Server: Distributed Request Tracing
  
  * Spring Boot Admin Server: Service Monitoring & Health Checks


  📚 Tech Stack
  -------------
* Spring Boot (Web, Data JPA, Security, Actuator)

* Spring Cloud (Eureka, Config, Gateway, Sleuth, Zipkin)

* Kafka (Event-driven communication)

* JWT (Authentication & Authorization)

* MySQL (Database)

* Docker (Containerization)

* Postman (API Testing)

🛡️ Security
 ---------
* Secure APIs using JWT Authentication

* Role-Based Access Control (ROLE_CUSTOMER, ROLE_EMPLOYEE, ROLE_ADMIN)

* Token validation at the API Gateway before forwarding requests

🔥 Kafka Messaging
------------------
* Transaction Service sends Kafka events for activities like deposits, withdrawals, and transfers.

* Notification Service listens to Kafka topics and sends notifications accordingly.


# ⚙️ Setup & Run
Prerequisites
-------------
Java 17+

Maven 3.8+

Docker (for Kafka and Zipkin)

MySQL Server

Postman

# Step
-- Clone the Repository
git clone https://github.com/your-username/banking-application.git

cd banking-application/

-- Start Config Server, Eureka Server, API Gateway

cd config-server && mvn spring-boot:run

cd eureka-server && mvn spring-boot:run

cd api-gateway && mvn spring-boot:run

--- Start Core Microservices

cd auth-service && mvn spring-boot:run

cd user-service && mvn spring-boot:run

cd account-service && mvn spring-boot:run

cd transaction-service && mvn spring-boot:run

cd loan-service && mvn spring-boot:run

cd notification-service && mvn spring-boot:run

--Start Zipkin and Kafka (using docker-compose)

docker-compose up -d
🧪 Testing the APIs

Use the provided Postman collection: postman-collection.json

Workflow:
---------

Register/Login using Auth Service

Get JWT Token

Use token to create accounts, transactions, apply for loans, etc.

# 📋 Future Enhancements
Kafka Dead Letter Queue (DLQ) support

ElasticSearch Integration for transaction history

Circuit Breakers (using Resilience4j)

OAuth2 support for external APIs

# 🙌 Contributing
Feel free to raise issues and pull requests!
This project is open for collaboration.

# 📧 Contact
Developer: Suresh Pattanaik
Email: sureshpattanaik14920@gmail.com
LinkedIn: https://www.linkedin.com/in/spattanaik06/

⭐ Happy Banking 🚀
