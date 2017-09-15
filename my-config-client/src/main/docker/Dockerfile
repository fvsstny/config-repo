FROM java:8
# 持久化存储
VOLUME /tmp
ADD my-config-client-0.0.1-SNAPSHOT.jar client.jar
RUN bash -c 'touch client.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/client.jar"]
