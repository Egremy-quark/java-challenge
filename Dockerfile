# Usa una imagen base de Java 8
FROM openjdk:8-jdk-alpine

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el archivo JAR de la aplicación al contenedor
COPY target/fred_challenge-0.0.1-SNAPSHOT.jar /app/mi-app.jar


# Expone el puerto en el que tu aplicación escucha (por ejemplo, 8080)
EXPOSE 8080


# Comando para ejecutar tu aplicación cuando se inicie el contenedor
ENTRYPOINT ["java", "-jar", "/app/mi-app.jar"]
