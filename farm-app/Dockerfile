FROM eclipse-temurin:17-jdk-focal as build

WORKDIR /app

COPY mvnw pom.xml ./
COPY .mvn/ .mvn

RUN ./mvnw dependency:go-offline -B

COPY ./src ./src

CMD [ "./mvnw", "spring-boot:run" ]
