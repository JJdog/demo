# CentOS with JDK 8
# centos作为基础镜像
# https://hub.docker.com/_/centos?tab=tags 查询版本 ，不加版本就是最新的版本
FROM registry.cn-shanghai.aliyuncs.com/zhangsw/centos-java:7.4-jdk8u171

# 维护者虚拟机开机黑屏
MAINTAINER  zsw

VOLUME /tmp
# 暴露端口
EXPOSE 8123
# 切换当前目录
WORKDIR /home/
# 创建目录
RUN mkdir zsw
# pom文件里的参数
ARG JAR_FILE

# jenkins打好的包 复制到 容器内,名称随便取
COPY ${JAR_FILE}  demo.jar

#启动上一步复制的jar
ENTRYPOINT ["java","-jar", "./demo.jar"]