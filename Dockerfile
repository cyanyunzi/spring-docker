FROM openjdk:8u201-jdk-alpine3.9

VOLUME /tmp

ADD target/spring-docker-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]

EXPOSE 8080
