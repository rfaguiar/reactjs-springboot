## Instruções docker:
* mvn clean package dockerfile:build
* docker run -p 8080:8080 --link mysql-5.6:localhost --name cdc-api -d rfaguiar/cdc-api