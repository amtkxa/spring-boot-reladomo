# spring-boot-reladomo
REST APIs implemented using Spring Boot, Reladomo

## Description


### Domain model
A simple domain model of this application can be expressed in UML as follows.
![domain_model](https://user-images.githubusercontent.com/32428472/50054750-b2e45800-0188-11e9-8aeb-fad5262e78d8.png)

## Requirements
* JDK 8
* Apache Maven
* PostgreSQL

## Get the source codes
Get a copy of the source codes into local system.
```
git clone https://github.com/amtkxa/spring-boot-reladomo
```

## Initial setting
### Maven
Run the following command.
```
mvn clean install
```
Running this command does the following.
* Installs artifacts into the local maven repository.
* Generate Java source code and DDL script from Reladomo XML file.
* Compiles source code, and making a Jar file.

### Database

## Run the project
Run the backend API server with following command.
```
mvn spring-boot:run
```

There is a Swagger UI configured for visualizing the REST APIs.
[http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)
