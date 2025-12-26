FROM eclipse-temurin:17-jre

WORKDIR /app
COPY target/hello-java-jenkins-1.0.jar app.jar

EXPOSE 8080

CMD ["java", "--add-modules", "jdk.httpserver", "-jar", "app.jar"]
