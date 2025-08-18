# Spring Boot Micro Services

A comprehensive microservices architecture built with Spring Boot, designed to demonstrate scalable, modular, and cloud-ready enterprise applications.

---

## Table of Contents

- [Overview](#overview)
- [Architecture](#architecture)
- [Microservices Breakdown](#microservices-breakdown)
  - [API Gateway](#api-gateway)
  - [Config Server](#config-server)
  - [ConfigServer Properties](#configserver-properties)
  - [Department Service](#department-service)
  - [Employee Service](#employee-service)
  - [Organisation Service](#organisation-service)
  - [Service Registry](#service-registry)
- [Getting Started](#getting-started)
- [Tech Stack](#tech-stack)
- [Configuration](#configuration)
- [Running the System](#running-the-system)
- [Contributing](#contributing)
- [License](#license)

---

## Overview

This repository contains a collection of microservices for a typical organization, including employee, department, and organization management. It demonstrates cloud-native principles using Spring Boot, Spring Cloud, and related technologies.

## Architecture

The system follows a distributed microservices architecture:

- **API Gateway**: Central entry point for all client requests, routing to appropriate services.
- **Config Server**: Centralized configuration management for all microservices.
- **Service Registry**: Enables service discovery for dynamic scaling and load balancing.
- **Individual Microservices**: Each responsible for a specific domain (Employee, Department, Organisation).


---

## Microservices Breakdown

### API Gateway

Handles all incoming API requests, provides routing, security, and monitoring. Built using Spring Cloud Gateway.

**Path:** `api-gateway/`  
**Features:**
- Request routing
- Authentication and authorization (plug-and-play)
- Load balancing

### Config Server

Centralized external configuration for all microservices, based on Spring Cloud Config. Enables dynamic configuration updates.

**Path:** `config-server/`  
**Features:**
- Centralized config management
- Versioned properties
- Supports multiple environments

### ConfigServer Properties

Contains the configuration property files for various environments and services.

**Path:** `ConfigServer-Properties/`  
**Features:**
- YAML/Properties files per microservice
- Environment-specific configs

### Department Service

Handles department-related data and business logic. Exposes REST endpoints for department management.

**Path:** `department-service/`  
**Features:**
- CRUD operations for departments
- Inter-service communication

### Employee Service

Manages employee data and operations. Exposes REST endpoints for employee management.

**Path:** `employee-service/`  
**Features:**
- CRUD operations for employees
- Inter-service communication

### Organisation Service

Handles organization-level data and logic. Manages organization structure, links departments and employees.

**Path:** `organisation-service/`  
**Features:**
- CRUD operations for organizations
- Hierarchical data management

### Service Registry

Implements service discovery using Netflix Eureka (or similar). Essential for locating services dynamically.

**Path:** `service-registry/`  
**Features:**
- Service registration and discovery
- Health checks

---

## Getting Started

### Prerequisites

- Java 24
- Maven 3.6+


### Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/Sai-Pulagam/Spring-Boot-Micro-Services.git
   cd Spring-Boot-Micro-Services
   ```
2. Start the Config Server, Service Registry, and API Gateway.
3. Start each microservice (`department-service`, `employee-service`, `organisation-service`).

---

## Tech Stack

- **Spring Boot** - Microservice framework
- **Spring Cloud** - Config, Gateway, Eureka
- **Maven** - Build tool
- **REST API** - Communication

---

## Configuration

- All configuration files are stored in `ConfigServer-Properties/`.
- Each service fetches its configuration from the Config Server at startup.

---

## Running the System

1. Start the Config Server:
   ```bash
   cd config-server
   mvn spring-boot:run
   ```
2. Start the Service Registry:
   ```bash
   cd service-registry
   mvn spring-boot:run
   ```
3. Start the API Gateway:
   ```bash
   cd api-gateway
   mvn spring-boot:run
   ```
4. Start all microservices similarly.

---

## Contributing

1. Fork the repo.
2. Submit a pull request with meaningful description.
3. Ensure all tests pass.

---

## License

This repository is licensed under the MIT License.

---

## Contact

For questions, reach out to [Sai-Pulagam](https://github.com/Sai-Pulagam).
