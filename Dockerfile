FROM openjdk:8-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} jpa-examples-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/jpa-examples-0.0.1-SNAPSHOT.jar"]