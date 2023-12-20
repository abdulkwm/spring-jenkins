FROM openjdk:17-slim
WORKDIR /app
COPY target/my-spring.jar .
CMD ["java","-jar","my-spring.jar"]