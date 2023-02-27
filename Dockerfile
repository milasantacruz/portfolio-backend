FROM openjdk:17-alpine
MAINTAINER kmisantacruz
COPY target/springboot-docker.jar springboot-docker.jar
ENTRYPOINT ["java","-jar","/springboot-docker.jar"]