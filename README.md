# Spring Boot Web-App : Demo
Spring Boot Demo Web-App

This is a Spring Boot Web-App that will use Postgres for persistant storage

List of commits

1. **display Students as list of objects**

In this commit we added two Student object as list so to display them on the route
`localhost:8080`  

2. **adding StudentController**

StudentController acts as API layer for of our Web-App accessible at route `http://localhost:8080/api/v1/student`.

- Note that at this commit-point `localhost:8080` won't work   

We are using N-Tier design pattern to implemnet this Web-App 

Source : https://stackify.com/n-tier-architecture/


3. **adding StudentService**

StudentService acts as Service-layer to cater the API layer a.k.a the StudentController.

