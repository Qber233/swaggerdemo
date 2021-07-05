
FROM jdk:8

COPY  *.jar /app.jar

CMD ["--server.port=8080"]

EXPOSE 8080

ENTRYPOINT ["java","-jar","/spring-boot-basic.jar"]