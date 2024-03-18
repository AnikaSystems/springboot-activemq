FROM amazoncorretto:21
WORKDIR /my-project
COPY . .
RUN ./gradlew clean bootJar
COPY build/libs/*.jar app.jar

EXPOSE 8080
#ENTRYPOINT ["java", "-Dspring.data.mongodb.uri=mongodb://your-mongodb:27017/db-name", "-jar", "/app.jar"]
ENTRYPOINT ["java", "-jar", "app.jar"]