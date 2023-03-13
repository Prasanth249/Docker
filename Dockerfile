FROM openjdk:17
EXPOSE 9088 
COPY target/Docker_Assignment-0.0.1-SNAPSHOT.jar ./
ENTRYPOINT ["java", "-jar", "Docker_Assignment-0.0.1-SNAPSHOT.jar"]


 