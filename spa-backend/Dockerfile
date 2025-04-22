FROM openjdk:21-jdk AS builder
WORKDIR /opt/app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN chmod +x mvnw && ./mvnw dependency:go-offline
COPY src/ ./src
RUN ./mvnw clean package -DskipTests

FROM openjdk:21-jdk 
WORKDIR /opt/app
EXPOSE 8080
COPY --from=builder /opt/app/target/*.jar /opt/app/*.jar
ENTRYPOINT ["java","-Dspring.profiles.active=prod", "-jar", "/opt/app/*.jar" ]