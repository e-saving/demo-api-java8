# For Java 8, try this
FROM adoptopenjdk/openjdk8:alpine-jre

# Refer to Maven build -> finalName
#ARG JAR_FILE=target/myapp_server-0.0.1-SNAPSHOT.jar

# cd /opt/app
WORKDIR /opt/app

# cp target/spring-boot-web.jar /opt/app/app.jar
#COPY ${JAR_FILE} app.jar
COPY target/*.jar app.jar

# java -jar /opt/app/app.jar
#ENTRYPOINT ["java","-jar","app.jar","--server.port=80"]
ENTRYPOINT ["java","-jar","app.jar"]
