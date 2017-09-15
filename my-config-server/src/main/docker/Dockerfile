FROM java:8
# 持久化存储
VOLUME /tmp
ADD my-config-server-0.0.1-SNAPSHOT.jar server.jar
RUN bash -c 'touch server.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/server.jar"]
