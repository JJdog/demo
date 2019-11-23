# CentOS with JDK 8
# centos作为基础镜像
# https://hub.docker.com/_/centos?tab=tags 查询版本 ，不加版本就是最新的版本
FROM registry.cn-shanghai.aliyuncs.com/zhangsw/centos-java:7.4-jdk8u171

# 维护者
MAINTAINER  zsw

VOLUME /tmp

EXPOSE 8123
WORKDIR /home

ARG JAR_FILE

COPY ${JAR_FILE} app.jar

# ENTRYPOINT ["java","-jar","./app.jar"]
