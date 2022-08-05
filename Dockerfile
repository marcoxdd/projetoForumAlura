FROM openjdk:11-jdk-oracle
RUN groupadd -S spring && useradd -S spring -G spring
USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]