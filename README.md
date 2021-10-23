# Spring Boot CQRS DEMO
    This application demonstrates CQRS design pattern with spring boot and Axon framework.

### Axon Server
    Download the Axon Server from the below link.
    You can download it in zip format. Start the the server.

[Download Axon Server](https://axoniq.io/download)

    java -jar .\axonserver.jar

### Build and Run

    mvn clean install
    mvn spring-boot:run

### Test

    You can test http://localhost:8081/products
    Post request with Prouct input json.
    Get request to get all Products as json.

[PostMan data](/src/test/data/cqrs-demo.postman_collection.json)

