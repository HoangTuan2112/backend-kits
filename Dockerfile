# Start with a base JDK image that has JDK 21
FROM openjdk:21-jdk-slim AS build

# Set working directory
WORKDIR /app

# Install Maven
RUN apt-get update && apt-get install -y maven

# Copy the project files to the container
COPY pom.xml ./
RUN mvn dependency:go-offline

COPY src ./src
RUN mvn package -DskipTests

# Final base image
FROM openjdk:21-jdk-slim
WORKDIR /app

# Copy the built application to the final image
COPY --from=build /app/target/*.jar app.jar

# Heroku assigns a dynamic port, so we need to use the $PORT environment variable
EXPOSE $PORT

# Use the Heroku-provided $PORT variable in the CMD
CMD ["sh", "-c", "java -Dserver.port=${PORT} -jar app.jar"]
