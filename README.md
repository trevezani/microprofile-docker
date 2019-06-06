# microprofile-docker
Microprofile  with Docker


## Options

Generating the executable jar file

`mvn clean package`

Running the sample

`java -jar target/microprofile-docker-thorntail.jar`

Generating the image

`mvn clean package docker:build`

Running the containner

`docker run -it -p 8080:8080 --name test-mp test-mp`


## Services

[http://localhost:8080/api/versao](http://localhost:8080/api/versao)

[http://localhost:8080/health](http://localhost:8080/health)

[http://localhost:8080/metrics](http://localhost:8080/metrics)


## Tecnologies in this sample
* Java 8
* JUnit 5
* REST
* Microprofile
* Docker