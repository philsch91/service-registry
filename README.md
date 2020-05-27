# Microservice Registry

based on 

- Spring Boot
- Netflix Eureka
- Netflix Zuul
- Netflix Ribbon
- Netflix Hystrix

## Build and Run 

1. `mvn package`
2. `docker build -t se/service-registry .`
3. `docker tag se/service-registry rabbitcarrental.azurecr.io/se/service-registry:latest`
4. `docker login rabbitcarrental.azurecr.io`
5. `docker push rabbitcarrental.azurecr.io/se/service-registry:latest`
6. `docker logout rabbitcarrental.azurecr.io`
7. `docker run -p 1111:1111 se/service-registry`
