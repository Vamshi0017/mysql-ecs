FROM openjdk:17-jdk

EXPOSE 9090

ADD target/ecs-vk.jar ecs-vk.jar

ENTRYPOINT ["java","-jar","ecs-vk.jar"]