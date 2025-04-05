# Spring Boot + PostgreSQL + Docker 🐘🚀

Este proyecto es una aplicación web desarrollada con **Spring Boot** que se conecta a una base de datos **PostgreSQL** utilizando **JPA/Hibernate**. La base se ejecuta dentro de un contenedor Docker, lo cual facilita el despliegue y la portabilidad.

## 🚀 Funcionalidades

- CRUD de productos
- Conexión a base de datos PostgreSQL vía JPA
- Contenedor PostgreSQL montado vía `docker-compose`
- Configuración automática de base de datos
- ORM con Hibernate

## ⚙️ Tecnologías usadas

- Java 17 (o versión que uses)
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Hibernate
- Docker
- Docker Compose

## 🐳 Cómo ejecutar con Docker

1. Clonar el repositorio:

```bash
git clone https://github.com/juan27k/springboot-postgresql-docker.git
cd springboot-postgresql-docker/core2

2. Levantar PostgreSQL con Docker
Si tenés docker-compose.yml, simplemente ejecutá:

bash
docker-compose up -d
💡 Alternativa (sin docker-compose):
docker run --name mypostgres2 -p 5432:5432 -e POSTGRES_PASSWORD=1234 -e POSTGRES_DB=tienda -d postgres
3. Ejecutar la app Spring Boot
Podés ejecutarla desde tu IDE o por consola con Maven:
./mvnw spring-boot:run
⚙️ Configuración de la base de datos (application.properties)
productos.estrategia=EN_BD

# Conexión a la base de datos PostgreSQL
spring.datasource.platform=postgres
spring.datasource.url=jdbc:postgresql://localhost:5432/tienda
spring.datasource.username=postgres
spring.datasource.password=1234

# Configuración de JPA / Hibernate
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=update
📦 Endpoints de ejemplo
Método	Endpoint	Descripción
GET	/productos	Listar todos los productos
POST	/productos	Crear un nuevo producto
PUT	/productos/{id}	Actualizar producto existente
DELETE	/productos/{id}	Eliminar producto
⚠️ Verificá tu clase @RestController si tenés mapeos adicionales.

🧠 Acceder a la base de datos gráficamente
Opción 1: Usar pgAdmin
Descargar desde: https://www.pgadmin.org/download/

Conectar a la base:

Host: localhost

Puerto: 5432

Usuario: postgres

Contraseña: 1234

Base de datos: tienda

Opción 2: Usar DBeaver
Descargar desde: https://dbeaver.io/download/

Crear nueva conexión PostgreSQL con los mismos datos anteriores.

🙌 Contribuciones
¿Querés colaborar? ¡Bienvenido!

1.Hacé un fork del repositorio

2.Creá una rama: git checkout -b feature/nueva-feature

3.Commit tus cambios: git commit -m "Agrega nueva feature"

4.Push a tu fork: git push origin feature/nueva-feature

5.Creá un Pull Request
📄 Licencia
Este proyecto se distribuye bajo la licencia MIT.
MIT License
Desarrollado con 💻 por Juan Manuel Cichello

