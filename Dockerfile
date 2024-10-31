# Stage 1: Build .jar
FROM openjdk:13.0-jdk-slim as builder
VOLUME /tmp
COPY . .
RUN ./gradlew test --tests StackTestCase
