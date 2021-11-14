#!/bin/bash
while ! nc -z config-service 8088; do sleep 3; done
java -jar $APP_FILE