FROM openjdk:11
EXPOSE 8085
ADD target/calculator-0.0.1-SNAPSHOT.jar calculator.jar
ENTRYPOINT ["java","-jar","calculator.jar"]