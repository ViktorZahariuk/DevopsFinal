
FROM maven:3.9.6-eclipse-temurin-17 AS builder
WORKDIR /build


COPY pom.xml .
RUN mvn dependency:go-offline -B

COPY src ./src


RUN mvn -B clean package -Dmaven.test.skip=true


FROM eclipse-temurin:17-jre-jammy
WORKDIR /app


COPY --from=builder /build/target/demo-1.0-SNAPSHOT-shaded.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
