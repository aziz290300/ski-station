# Use the OpenJDK 17 image from Docker Hub
FROM openjdk:17-jdk-alpine

# Expose the port that the Spring Boot application runs on
EXPOSE 8089
# Add the JAR file to the Docker image
COPY target/gestion-station-ski-17-0.0.1-SNAPSHOT.jar app.jar

# Set the entry point for the container
ENTRYPOINT ["java", "-jar", "/gestion-station-ski-17-0.0.1-SNAPSHOT.jar"]
