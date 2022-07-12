# JPA-Examples
* Alguns exemplos utilizando JPA.

# Iniciando o projeto.

### Build Project
* mvn clean install -DskipTests

### create image from dockerFile
* podman build -t jpa-example .
### create image from dockerFile
* podman run -d -p 8080:8080 localhost/jpa-example
