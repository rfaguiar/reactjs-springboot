FROM openjdk:8-jre-alpine
COPY ./cdcreact-1.0.0-SNAPSHOT.jar /usr/app.jar
WORKDIR /usr
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]