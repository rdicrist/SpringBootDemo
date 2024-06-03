IntelliJ Setup:
- Load project 
- set SDK to Java 17 (coretto)
- Maven 'clean' and 'install'
- Add application to Run Configuration (set command line to spring-boot:run in run config)
- Maven 'run' project

Endpoints:
- curl "http://localhost:8080"
- curl "http://localhost:8080/name?name=<NAME>"