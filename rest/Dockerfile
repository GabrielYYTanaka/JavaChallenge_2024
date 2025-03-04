# Usa uma imagem base com o JDK 17 para compilar
FROM eclipse-temurin:17-jdk AS build

# Copia o código-fonte para o contêiner
COPY . /app

# Define o diretório de trabalho
WORKDIR /app

# Compila o projeto
RUN ./mvnw clean install -DskipTests

# Usa uma imagem leve com o JRE 17
FROM eclipse-temurin:17-jre

# Copia o JAR gerado para o contêiner
COPY --from=build /app/target/rest-0.0.1-SNAPSHOT.jar /app/rest.jar

# Expõe a porta
EXPOSE 8080

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "/app/rest.jar"]