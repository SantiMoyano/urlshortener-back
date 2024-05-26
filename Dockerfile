# Usar una imagen base con JDK 17
FROM openjdk:17-jdk-slim

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar el archivo JAR y el archivo .env al contenedor
ARG JAR_FILE=target/urlshortener-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

# Exponer el puerto 8080
EXPOSE 8080

# Ejecutar la aplicación
ENTRYPOINT ["sh", "-c", "java -jar app.jar"]
