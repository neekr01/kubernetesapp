FROM openjdk:8
ADD target/kubernetesapp-0.0.1-SNAPSHOT.jar kubernetesapp-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","/kubernetesapp-0.0.1-SNAPSHOT.jar"]
EXPOSE 1001