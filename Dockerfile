FROM eclipse-temurin:17-jdk-jammy

VOLUME /tmp
ADD /target/D387_sample_code-0.0.2-SNAPSHOT.jar myapp.jar
RUN sh -c 'touch /myapp.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/myapp.jar"]

