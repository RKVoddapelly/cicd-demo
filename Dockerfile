FROM openjdk:14-alpine
COPY ["/target/cicd-demo-1.0.1.jar", "/opt/apps/jenkins1app/"]
WORKDIR /opt/apps/jenkins1app
CMD ["java", "-jar", "cicd-demo-1.0.1.jar"]
