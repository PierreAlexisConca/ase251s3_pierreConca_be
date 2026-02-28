# ase251s3_pierreConca_be

## Notas

1. ingrese a spring initializr
2. ingrese las caracteristicas que me dieron de ejemplo en el proyecto
3. genere mi codigo fuente
4. extrai en demo.zip para que se genere la carpeta
5. cree mi repositorio y lo clone
6. puse los codigos de demo.zip dentro de mi repositorio
7. subi mi repositorio

## Ejecutar (Windows)

No ejecutes clases Spring Boot con `javac` directo (te saldrá `package org.springframework.boot does not exist`) porque Spring se carga por Maven.

### Opción 1: por comando (PowerShell)

En la carpeta raíz (donde está `pom.xml`):

- `.\mvnw.cmd spring-boot:run`

### Opción 2: con VS Code (Task)

- `Terminal` → `Run Task...` → **Run Spring Boot (mvnw)**

## Ver el "HOLA MUNDO"

Cuando la app esté corriendo, llama:

- `http://localhost:8080/saludos`

Esto devuelve texto plano (solo los mensajes, una línea por saludo) e imprime en consola un log tipo `GET /saludos -> ...`.
