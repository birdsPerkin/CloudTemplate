#penjdk:8-jre 为基础镜像，来构建此镜像，可以理解为运行的需要基础环境
FROM openjdk:8-jre

MAINTAINER liu.gx birds_perkin@163.com

ADD target/eureka-cunsumer-0.0.1-SNAPSHOT.jar eureka-cunsumer-0.0.1-SNAPSHOT.jar

EXPOSE 9901

ENTRYPOINT ["java", "-jar", "/eureka-cunsumer-0.0.1-SNAPSHOT.jar"]