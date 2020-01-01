# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Add Maintainer Info
LABEL maintainer="rogeriotakashi@hotmail.com"

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 10000 available to the world outside this container
EXPOSE 10000

# The application's jar file
ARG JAR_FILE=target/discovery-server-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} /discovery-server.jar

# Run the jar file
CMD ["java","-jar","/discovery-server.jar"]