FROM tomcat:9.0.24
VOLUME /tmp
COPY target/KafkaProject-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/docker-springboot.war
ENTRYPOINT [ "sh", "-c", "java -Dspring.profiles.active=docker -Djava.security.egd=file:/dev/./urandom -jar /usr/local/tomcat/webapps/docker-springboot.war" ]