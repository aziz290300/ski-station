FROM openjdk:17-jdk-alpine



EXPOSE 8089

WORKDIR /DevOps_Project

ADD target/gestion-station-ski-1.0.jar /DevOps_Project/app.jar

ENTRYPOINT ["java", "-jar", "/app/app.jar"]