## Instruções docker:  
* docker build --tag cdc-api   
* docker run -p 8000:8080 --link mysql-5.6:localhost --name cdc-api -d cdc-api