FROM openjdk:18
WORKDIR /app
COPY . /target/Spring-Boot-CI-CD-0.0.1-SNAPSHOT.jar/app
EXPOSE 9090
ENTRYPOINT [ "java" , "-jar" "Spring-Boot-CI-CD-0.0.1-SNAPSHOT.jar" ]	