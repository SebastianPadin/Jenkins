
# Sonar Analysis Demo 🤳🏽

Este repositorio es un proyecto base diseñado para ayudarte a analizar la calidad del código utilizando SonarQube. El propósito de este proyecto es proporcionar un entorno donde puedan identificar y solucionar errores comunes de calidad de código en un proyecto de Spring Boot.

## Descripción del Proyecto ⌨️

Este es un simple proyecto de **Spring Boot** que contiene algunos errores intencionales para que puedas analizarlos y mejorar la calidad del código utilizando **SonarQube**. Los errores incluyen:
- Código duplicado
- Métodos largos
- Excepciones no manejadas
- Variables no utilizadas
- Lógica no optimizada

El objetivo de este repositorio es que puedas realizar un análisis de calidad de código y aplicar mejoras según los hallazgos de SonarQube.

## Pasos para Ejecutar el Proyecto⏳

### 1. Clona el Repositorio 

Primero, clona este repositorio en tu máquina local:

```bash
git clone https://github.com/tu_usuario/sonar-analysis-demo.git
```

### 2. Compila el Proyecto

Navega al directorio del proyecto y compílalo utilizando Maven:

```bash
cd sonar-analysis-demo
mvn clean install
```

### 3. Ejecuta la Aplicación

Una vez compilado el proyecto, ejecuta la aplicación de Spring Boot:

```bash
mvn spring-boot:run
```

La aplicación se ejecutará en el puerto `8080` por defecto. Puedes acceder a la aplicación en tu navegador utilizando:

```
http://localhost:8080
```

### 4. Configura SonarQube

Si aún no tienes SonarQube instalado, puedes seguir las instrucciones oficiales de la [documentación de SonarQube](https://docs.sonarqube.org/latest/) para configurar una instancia local en tu máquina.

### 5. Analiza el Proyecto con SonarQube

Una vez que tengas SonarQube configurado, ejecuta el siguiente comando para analizar el código de este proyecto:

```bash
mvn sonar:sonar
```

Este comando enviará el código al servidor de SonarQube para su análisis.

### 6. Accede a SonarQube

Abre tu navegador y ve a la interfaz web de SonarQube:

```
http://localhost:9000
```

### 7. Revisa los Resultados

Dentro de SonarQube, podrás ver un análisis detallado del código, incluyendo:

- Duplicación de código
- Complejidad ciclomática
- Violaciones de reglas de codificación
- Cobertura de pruebas

## Retos 🖱️ 
 
Una vez que hayas configurado y ejecutado SonarQube, realiza los siguientes retos:

1. **Identificar y corregir errores de calidad de código**:
   - Encuentra código duplicado y refactorízalo.
   - Revisa los métodos largos y refactóralos en métodos más pequeños.
   - Maneja las excepciones de manera adecuada.
   - Elimina las variables no utilizadas.

2. **Refactorización del código**:
   - Optimiza la lógica en las clases `Controller` y `Service`.
   - Asegúrate de que todos los métodos estén documentados.
   - Mejora la legibilidad del código aplicando buenas prácticas de desarrollo.

## Archivos Importantes

- **`src/main/java/com/example/demo/`**:
  - `DemoApplication.java`: Clase principal de la aplicación de Spring Boot.
  - `Controller.java`: Contiene algunos errores como métodos largos y manejo de excepciones inadecuado.
  - `Service.java`: Incluye lógica repetitiva y errores de optimización.

- **`sonar-project.properties`**: Archivo de configuración de SonarQube para este proyecto.
  
  ```properties
  sonar.projectKey=sonar-analysis-demo
  sonar.projectName=Sonar Analysis Demo
  sonar.projectVersion=1.0
  sonar.sources=src/main/java
  sonar.language=java
  sonar.sourceEncoding=UTF-8
  ```

- **`pom.xml`**: Archivo de configuración de Maven con las dependencias necesarias para Spring Boot y SonarQube.

## Recursos

- [Documentación de SonarQube](https://docs.sonarqube.org/latest/)
- [Documentación de Spring Boot](https://spring.io/projects/spring-boot)

## ¿Cómo Contribuir?

Si deseas contribuir con mejoras o correcciones a este repositorio, por favor abre un *pull request* con las modificaciones necesarias.

---

¡Esperamos que este proyecto te ayude a entender mejor cómo usar SonarQube para analizar la calidad del código y cómo mejorar las prácticas de desarrollo de software!

```
