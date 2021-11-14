FROM eclipse-temurin:11.0.13_8-jre-alpine
ENV APP_FILE product-service-1.0-SNAPSHOT.jar
ENV APP_HOME /app
EXPOSE 8091
COPY target/$APP_FILE $APP_HOME/
COPY start.sh $APP_HOME/
WORKDIR $APP_HOME
ENTRYPOINT ["sh", "start.sh"]
