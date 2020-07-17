# CONTAINER DEPLOYED OK -----------------------------------
#
# FROM openjdk:8
# ADD target/news-docker-spring-boot-mysql.jar news-docker-spring-boot-mysql.jar
# EXPOSE 8085
# ENTRYPOINT ["java", "-jar", "news-docker-spring-boot-mysql.jar"]


FROM openjdk:8

ADD target/news.jar news.jar

EXPOSE 8086

ENTRYPOINT ["java", "-jar", "news.jar"]
