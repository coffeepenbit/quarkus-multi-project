# Quarkus Multi Project Scaffold

This repository demonstrates a Gradle multi-project build using Quarkus 3.20 and Java 21.  
It contains a shared library module and two service modules.

## Structure

- `libs` – common code shared by the services
- `services/fooservice` – example service consuming the library
- `services/barservice` – another service using the same library
- `config/application.properties` – default configuration for all modules
- `docker/Dockerfile.jvm` – reusable container image definition

Each service can override configuration by providing its own `application.properties`.

The build creates a combined JaCoCo report.
