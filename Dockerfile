FROM openjdk:14.0.1
VOLUME /tmp
EXPOSE 	8081
ADD ./target/exam-parameta-soap-0.0.1-SNAPSHOT.jar exam-parameta-soap.jar
ENTRYPOINT ["java", "-jar", "/exam-parameta-soap.jar"]
