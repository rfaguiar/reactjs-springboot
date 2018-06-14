FROM openjdk:8-jre-alpine
WORKDIR /usr
ADD target/cdc-api-1.0.0.jar /usr/app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]