FROM adoptopenjdk/openjdk11:x86_64-alpine-jre11u-2023-08-10-23-48-beta-nightly
COPY target/web-service.jar  web-service.jar
ENTRYPOINT ["java", "-jar", "/web-service.jar"]