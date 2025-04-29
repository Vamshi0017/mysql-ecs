# Build stage
FROM maven:3.8.4-openjdk-17 as build

WORKDIR /app
COPY . .
RUN mvn clean install -DskipTests

# Final image
FROM openjdk:17-jdk

EXPOSE 9090

COPY --from=build /app/target/ecs-vk.jar ecs-vk.jar

ENTRYPOINT ["java", "-jar", "ecs-vk.jar"]
