# Fred Challenge

Este proyecto es una aplicación web desarrollada con Spring Boot y Java 8. A continuación, se presentan las instrucciones para empaquetar la aplicación y ejecutarla dentro de un contenedor Docker.

## Prerrequisitos

Antes de empezar, asegúrate de tener instalados los siguientes programas en tu máquina:

- [Java 8 JDK](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html)
- [Maven](https://maven.apache.org/install.html)
- [Docker](https://www.docker.com/products/docker-desktop)

#### - Compilar el Proyecto

Para compilar el proyecto y generar el archivo `.jar`, utiliza el siguiente comando:

```
mvn clean package
```

#### - Usa una imagen base de Java 8
```
FROM openjdk:8-jdk-alpine
```

#### - Establece el directorio de trabajo dentro del contenedor
```
WORKDIR /app
```

#### - Copia el archivo JAR de la aplicación al contenedor
```
COPY target/fred_challenge-0.0.1-SNAPSHOT.jar /app/mi-app.jar
```

#### - Expone el puerto en el que tu aplicación escucha (por ejemplo, 8080)
```
EXPOSE 8080
```

#### - Comando para ejecutar tu aplicación cuando se inicie el contenedor
```
ENTRYPOINT ["java", "-jar", "/app/mi-app.jar"]
```

# Paso 2: Construir la Imagen Docker
```
docker build -t fred_challenge .
```

# Paso 3: Ejecutar el Contenedor
```
docker run -p 8081:8080 fred_challenge
```

# Paso 4: Acceder a la Aplicación
```
http://localhost:8081
```# java-challenge
