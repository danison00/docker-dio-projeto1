FROM maven:3.9.6-eclipse-temurin-17-alpine as mvn
COPY . .
RUN mvn package

FROM alpine
RUN apk update && apk add --no-cache openjdk17-jre
COPY  --from=mvn target/simpleApp-0.0.1-SNAPSHOT.jar /opt/app.jar
WORKDIR /opt
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]

