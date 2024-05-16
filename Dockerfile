FROM openjdk:17 
EXPOSE 8080
ADD target/cicd-test.jar cicd-test.jar 
ENTRYPOINT ["java", "-jar", "cicd-test.jar"]