FROM alpine/java:21-jre

WORKDIR /usr/local/app

COPY build/libs/demo-0.0.1-SNAPSHOT.jar ./app.jar
EXPOSE 8080


CMD java -jar app.jar