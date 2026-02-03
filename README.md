# BarcelonaSmartCycle

## Descripción general

BarcelonaSmartCycle es una prueba de concepto (PoC) de una plataforma
Smart City orientada a la monitorización inteligente de los carriles
bici de la ciudad de Barcelona.

El objetivo del proyecto es demostrar competencias avanzadas de backend
en Java mediante el diseño de una API segura y escalable que permita:

-   Registrar tramos de carril bici.
-   Recibir incidencias desde ciudadanos y sensores IoT.
-   Evaluar el estado de la infraestructura.
-   Calcular niveles de riesgo.
-   Priorizar tareas de mantenimiento.
-   Generar métricas para la toma de decisiones municipales.

El proyecto está pensado como portfolio profesional y ejemplo de
arquitectura backend moderna, aplicando SOLID, DDD ligero, patrones de
diseño y prácticas de seguridad alineadas con OWASP.

------------------------------------------------------------------------

## Casos de uso principales

### Ciudadano

-   Reportar incidencias.
-   Consultar estado de carriles cercanos.

### Sensores IoT

-   Enviar eventos automáticos (bloqueos, daños, clima).
-   Reportar estado periódico.

### Inspector

-   Validar incidencias.
-   Realizar inspecciones.
-   Asignar puntuaciones.

### Administrador municipal

-   Visualizar métricas.
-   Crear tareas de mantenimiento.
-   Gestionar usuarios y equipos.

------------------------------------------------------------------------

## Dominio principal

Entidades clave:

-   BikeLane
-   Incident
-   Inspection
-   MaintenanceTask
-   User

Roles:

-   CITIZEN
-   INSPECTOR
-   MUNICIPAL_ADMIN
-   SENSOR

------------------------------------------------------------------------

## Arquitectura

Arquitectura hexagonal (Ports & Adapters) con DDD ligero:

-   domain
-   application
-   infrastructure
-   interfaces

Separación estricta entre dominio y framework.

------------------------------------------------------------------------

## Tecnologías

### Backend

-   Java 17
-   Spring Boot 3
-   Spring Security
-   JPA / Hibernate
-   PostgreSQL + PostGIS
-   Flyway

### Seguridad

-   JWT + Refresh Tokens
-   RBAC
-   API Keys para sensores
-   HMAC + nonce
-   Rate limiting (Bucket4j)
-   Auditoría completa
-   Protección OWASP Top 10
-   Validación de entrada

### Infraestructura

-   Docker
-   Docker Compose
-   Testcontainers
-   OpenAPI / Swagger

### Testing

-   JUnit 5
-   Mockito
-   Tests de integración
-   Tests de seguridad

------------------------------------------------------------------------

## Patrones de diseño incluidos

-   Strategy (priorización de mantenimiento)
-   Factory (creación de incidencias)
-   Command (casos de uso)
-   Adapter (sensores)
-   Specification (consultas)
-   Decorator (auditoría)
-   Observer (notificaciones)
-   Repository

------------------------------------------------------------------------

## Seguridad

El proyecto implementa:

-   Autenticación JWT para usuarios.
-   Autenticación por API Key para sensores.
-   Protección contra IDOR.
-   Rate limiting.
-   Auditoría de todas las operaciones críticas.
-   Gestión segura de secretos.
-   Threat modeling basado en STRIDE.

Se incluye documentación de amenazas en /docs.

------------------------------------------------------------------------

## Roadmap

### Sprint 1

-   Estructura del proyecto
-   Autenticación
-   Gestión de usuarios
-   Entidad BikeLane
-   Docker básico

### Sprint 2

-   Incidencias
-   Integración sensores
-   Estrategias de cálculo de riesgo

### Sprint 3

-   Inspecciones
-   Tareas de mantenimiento
-   Métricas

### Sprint 4

-   Testing completo
-   Seguridad avanzada
-   Threat model
-   README profesional
-   Diagramas

------------------------------------------------------------------------

## Objetivo profesional

Este proyecto demuestra:

-   Arquitectura backend profesional
-   Aplicación real de SOLID
-   Patrones de diseño
-   Seguridad avanzada
-   Integración geoespacial
-   Testing
-   Dockerización

Está diseñado como portfolio técnico para procesos de selección backend
Java.
