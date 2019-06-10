# microprofile-docker
Microprofile with Docker generated with [thorntail.io/generator/](https://thorntail.io/generator/)


## Options

Generating the executable jar file

`mvn clean package`

Running the sample

`java -jar target/microprofile-docker-thorntail.jar`

Generating the image

`mvn clean package docker:build`

Running the containner

`docker run -it -p 8080:8080 --name test-mp microprofile-docker:1.0.0-SNAPSHOT`


## Services

[http://localhost:8080/api/versao](http://localhost:8080/api/versao)

[http://localhost:8080/health](http://localhost:8080/health)

[http://localhost:8080/metrics](http://localhost:8080/metrics)


## Tecnologies in this sample
* Java 8
* REST
* Microprofile
* Docker