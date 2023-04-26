FROM openjdk:8-alpine
COPY ./target/ems-0.0.1-SNAPSHOT.jar /usr/app/ems-0.0.1-SNAPSHOT.jar
WORKDIR /usr/app
EXPOSE 8080:8080
ENTRYPOINT ["java", "jar", "ems-0.0.1-SNAPSHOT.jar"]