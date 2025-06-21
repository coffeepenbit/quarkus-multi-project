# Quarkus Multi-Project Scaffold

This repository provides a simple multi-project setup for Quarkus 3.20 with Gradle 8.14.2 and JDK 21. It demonstrates a shared `libs` module consumed by two example services.

The root `config/application.properties` supplies defaults that each service can override with its own configuration. The root `docker/Dockerfile.jvm` acts as the base container image definition. Services reference it through symbolic links but may define their own Dockerfile if necessary.

A root `.env` file shows how environment variables can be shared across subprojects.

Running `./gradlew test` executes unit tests for all modules. Execute `./gradlew testCodeCoverageReport` to produce a combined JaCoCo report.
