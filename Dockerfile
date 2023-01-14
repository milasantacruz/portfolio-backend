FROM amazoncorretto:11-alpine-jdk
MAINTAINER kmisantacruz
COPY target/demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/target/demo-0.0.1-SNAPSHOT.jar"]