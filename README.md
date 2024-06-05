IntelliJ Setup:
- Load project 
- set SDK to Java 17 (coretto)
- Maven 'clean' and 'install'
- Add application to Run Configuration (set command line to spring-boot:run in run config)
- Maven 'run' project

Endpoints:
- curl "http://localhost:8080"
- curl "http://localhost:8080/name?name=<NAME>"
- GraphQl: http://localhost:8080/graphiql

Database Setup:
- Download Docker and Docker Compose (CLI)
- Add PG dependency to POM
- Create docker-compose.yml and Dockerfile in root of project
- Add .env file in root of project
- Add .gitignore file, add .env to it
- Setup application.yml / application-dev.yml files with db connection info
- Add jpa dependancy to POM
- Create @Entity object, controller, JPA repository, service
- Run app, check if DB was created (postico or whatever)