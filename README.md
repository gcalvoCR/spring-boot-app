Esta es una aplicación simple de Spring Boot usando:

- JPA
- Thymeleaf
- Spring Boot Web
- MariaDB (como BD)

## Requisitos

- Tener MariaDB instalado. [Cliquee aquí para descargar](https://downloads.mariadb.org/)
- STS. [Cliquee aquí para descargar](https://spring.io/tools)

## Funcionalidad

- Expone un API Restful en el endpoint ```localhost:8080/suministros```
- Registra productos simples
- Lista los productos usando 2 alternativas: 
    ..* Renderizado de datatables aprovechando la respuesta del APIRestful
    ..* Páginas creadas desde el servidor usando Thymeleaf como templates.


## Notas

1. Para poder correr la aplicación primeramente debe crear la BD en MariaDB. Para esto en el ROOT del repositorio se encontrará un archivo ```DB.sql``` el cual puede usar como base.
Es importante:
- Respetar los nombres de las tablas.
- Los nombres de los campos de cada una de las tablas.


2. Se debe modificar la ruta a la BD según sea su caso. Dicha configuración se puede observar en el directorio
 ```spring-boot-app/src/main/resources/application.properties```



___

### Realizado por: Gabriel Calvo Vargas

¿Quiere conversar? Contacteme [aquí](https://www.linkedin.com/in/gabriel-calvo-vargas-932b3357/). 