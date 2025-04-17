# Usa una imagen base con Java 17 (puedes ajustar si usas otra versión)
FROM eclipse-temurin:17-jdk

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el archivo JAR al contenedor
COPY target/microservice-0.0.1-SNAPSHOT.jar app.jar

# Expone el puerto (Render usa este para redirigir tráfico)
EXPOSE 8080

# Comando para ejecutar el JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
