# Use an official JDK 22 runtime as a parent image
FROM openjdk:22-jdk-alpine
# Set the working directory inside the container
WORKDIR /app
# Copy the application JAR from the local 'target' directory to the '/app' directory in the container
COPY target/user-microservice-0.0.1-SNAPSHOT.jar /app/user-microservice.jar

# Run the application
ENTRYPOINT ["java", "-jar", "/app/user-microservice.jar"]