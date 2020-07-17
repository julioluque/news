# ---- news ----
Microservicio con Spring Boot para Registro diario de noticias


# ---- Backend ----
* MySql 8.18
* PostgreSql 12
* Hibernate 5.4.18
* Spring Boot 2.3.1
* Jpa  

# ---- Json ----
Create Basico
El Id es identado

{
    "nombre":"Julio Alfredo",
    "comentario":"Deployar microservicio, solo cuenta con dos controladores, pendiente de finalizar el crud.",
    "fecha": "2020-07-15"
}

# ---- Docker ----
Empaquetar en container para deployar en docker.
Pasos:

# pom.xml 
Definimos el nombre del jar con finalNamle dentro del build

	<build>
		<plugins>
		...
		<configuration>
					<finalName>news-docker-spring-boot-mysql</finalName>
				</configuration>
		</plugins>
	</build>

# Dockerfile 
Seteamos el docker file con el finalName definido en el pom. 
Si no se setea, tomar el nombre del jar snapshot que fue compilado en el target.
El dokerfile quedaria asi:

	FROM openjdk:8
	ADD target/news-docker-spring-boot-mysql.jar news-docker-spring-boot-mysql.jar
	EXPOSE 8085
	ENTRYPOINT ["java", "-jar", "news-docker-spring-boot-mysql.jar"]


# Terminal 
Nos paramos en la raiz del proyecto y compilamos generado el jar
PS C:\Users\Alfredo\wkSpring\news> 
$ mvn package
$ docker build . -t imagenApp
$ docker run -p 8085:8085 --name imagenApp --link ImagenMySqlConMiBD:ImagenMysqlPuro -d imagenApp

# Lanzamos un contenedor
$ mvn clean
$ mvn package
$ docker build . -t news-docker-spring-boot-mysql
$ docker run -p 8085:8085 --name news-docker-spring-boot-mysql --link news-mysql:mysql -d news-docker-spring-boot-mysql

# Lanzamos otro contenedor
$ mvn clean
$ mvn package
$ docker build . -t news
$ docker run -p 8086:8086 --name news --link news-mysql:mysql -d news


# Mysql config
PS C:\Users\Alfredo\wkSpring\news> docker run --name news-mysql -e MYSQL_ROOT_PASSWORD=1234 -e MYSQL_PASSWORD=1234 -e MYSQL_USER=root -e MYSQL_DATABASE=news -d mysql:8 

ping 172.20.117.161
