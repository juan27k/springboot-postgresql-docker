# Spring Boot + PostgreSQL + Docker 🐘🚀

Este proyecto es una API REST de ejemplo desarrollada con Spring Boot que se conecta a una base de datos PostgreSQL. Toda la infraestructura de base de datos puede levantarse con Docker para facilitar pruebas y despliegues.

📦 Tecnologías utilizadas
Java 17

Spring Boot 3

Spring Data JPA + Hibernate

PostgreSQL

Docker

Maven

🚀 Cómo clonar y ejecutar
bash
Copiar
Editar
git clone https://github.com/juan27k/springboot-postgresql-docker.git
cd springboot-postgresql-docker/core2
1️⃣ Levantar PostgreSQL con Docker
bash
Copiar
Editar
docker run --name mypostgres2 -p 5432:5432 \
-e POSTGRES_PASSWORD=1234 \
-e POSTGRES_DB=tienda \
-d postgres
También podés usar docker-compose.yml si lo agregás al proyecto.

2️⃣ Ejecutar el proyecto Spring Boot
Importá el proyecto en tu IDE favorito (Eclipse, IntelliJ, VS Code) y ejecutá la clase principal Core2Application.java.

Asegurate de tener configurado tu archivo application.properties:

properties
Copiar
Editar
productos.estrategia=EN_BD
spring.datasource.url=jdbc:postgresql://localhost:5432/tienda
spring.datasource.username=postgres
spring.datasource.password=1234
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
🌐 Endpoints disponibles
Método	Endpoint	Descripción
GET	/productos	Lista todos los productos
POST	/productos	Crea un nuevo producto
PUT	/productos/{id}	Actualiza un producto existente
DELETE	/productos/{id}	Elimina un producto
🐘 Acceder a PostgreSQL vía GUI
Si deseás administrar la base gráficamente, podés usar PgAdmin o DBeaver:

Host: localhost

Puerto: 5432

Usuario: postgres

Contraseña: 1234

Base de datos: tienda

📂 Estructura
bash
Copiar
Editar
core2/
├── src/
│   └── main/
│       ├── java/com/ejemplo/core2/...
│       └── resources/
│           ├── application.properties
│           └── ...
├── pom.xml
└── README.md
🧑 Autor
Juan Manuel Cichello
LinkedIn

📄 Licencia
MIT

