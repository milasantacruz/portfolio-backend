FROM amazoncorretto:11-alpine-jdk
MAINTAINER kmisantacruz
COPY target/springboot-docker.jar springboot-docker.jar
ENTRYPOINT ["java","-jar","/springboot-docker.jar"]