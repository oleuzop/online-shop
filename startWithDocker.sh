#!/bin/bash

rm -rf frontend-service/dist

mvn clean install

docker-compose up --build


