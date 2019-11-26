FROM openjdk:13
ADD target/resource-server-1.jar resource-server-1.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "resource-server-1.jar"]