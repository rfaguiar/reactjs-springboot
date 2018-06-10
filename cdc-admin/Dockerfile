FROM node:9.11.1-alpine as build
COPY . ./app
WORKDIR /app
RUN npm install
RUN npm run build

FROM node:9.11.1-alpine as desenv
COPY --from=build app ./app
WORKDIR /app
EXPOSE 3000
CMD [ "npm", "start" ]

FROM node:9.11.1-alpine as release
COPY --from=build app/build ./build
RUN npm install -g serve
EXPOSE 3000
CMD [ "serve", "-s", "build" ]