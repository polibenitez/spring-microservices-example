# Spring microservices example [![Build Status](https://travis-ci.org/zadik/spring-microservices-example.svg?branch=master)
 Example of microservices using Spring Boot and Docker

Comands to run the example.

 - Run mongo container: 
    docker run -P -d --name mongodb mongo
 - To build the project: 
    graddle build
 - To build out app in a container: 
    docker build -t microservicedemo/employee .
 - Link our mongo container with our app container and run it: 
    docker run -P -d --name employee --link mongodb microservicedemo/employee


