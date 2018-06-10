# sobe bd mysql
docker start mysql-5.6
# subir servidor backend
java -jar cdcreact-1.0.0-SNAPSHOT.jar

# instalando ultima versão do create react app
npm install create-react-app
# criar aplicação inicial react e pluguins cdc-admin
./node_modules/.bin/create-react-app cdc-admin

# Starts the development server.
npm start

# Bundles the app into static files for production.
npm run build
    
# Starts the test runner.
npm test
    
# Removes this tool and copies build dependencies, configuration files and scripts into the app directory. If you do this, you can’t go back!
npm run eject
    

# We suggest that you begin by typing:
cd cdc-admin
npm start

