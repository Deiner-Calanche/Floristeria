# Floristería-App

Floristería-App es una aplicación web diseñada para gestionar las operaciones de una floristería, como el manejo del inventario de flores, pedidos, entregas y finanzas. Desarrollada en **Spring Boot** utilizando **Java**, esta aplicación ofrece un sistema integral para que los dueños de floristerías puedan administrar su negocio de manera eficiente.

## Tabla de Contenidos
- [Características](#características)
- [Tecnologías Utilizadas](#tecnologías-utilizadas)
- [Arquitectura](#arquitectura)
- [Instalación](#instalación)
- [Ejecución](#ejecución)
- [Uso](#uso)
- [Estructura del Proyecto](#estructura-del-proyecto)
- [Contribuciones](#contribuciones)
- [Licencia](#licencia)

## Características

- **Inventario de Flores**: Gestión de inventarios con detalles sobre tipo de flor, color, variedad, cantidad disponible, precio de compra y venta.
- **CRUD Completo**: Operaciones para Crear, Leer, Actualizar y Eliminar (CRUD) flores.
- **Gestión de Pedidos**: Posibilidad de gestionar pedidos de clientes y mantener un registro del estado de cada uno.
- **Gestión de Entregas**: Control sobre las entregas de pedidos, incluyendo la asignación a conductores y seguimiento.
- **Informes**: Generación de informes para analizar ventas y tomar decisiones estratégicas.
- **Finanzas**: Generación de facturas y procesamiento seguro de pagos.

## Tecnologías Utilizadas

- **Java 21**
- **Spring Boot**
- **Spring Data JPA**
- **MySQL** como base de datos
- **Thymeleaf** para renderizado de vistas (HTML)
- **Lombok** para reducir el código repetitivo
- **Maven** para la gestión de dependencias

## Arquitectura

La aplicación sigue una arquitectura **MVC (Modelo-Vista-Controlador)**, donde cada componente tiene responsabilidades bien definidas:

- **Modelo**: La entidad `Flor` representa las flores en la base de datos.
- **Vista**: La interacción con el usuario (puede ser implementada con Thymeleaf o alguna otra tecnología de frontend).
- **Controlador**: Los controladores REST gestionan las solicitudes HTTP y responden con JSON.
- **Servicio**: La lógica de negocio se gestiona en las clases de servicio.
- **Repositorio**: El acceso a la base de datos se realiza a través de los repositorios que implementan `JpaRepository`.

## Instalación

### Requisitos Previos

1. Tener instalado **Java 21** .
2. Tener **MySQL** instalado y funcionando.
3. Tener **Maven** instalado para la gestión de dependencias.

### Paso a Paso

1. Clona el repositorio:

    ```bash
    git clone https://github.com/tuusuario/floristeria-app.git
    ```

2. Configura la base de datos en **MySQL**:

    ```sql
    CREATE DATABASE floristeria_app;
    ```

3. Modifica el archivo `application.properties` (o `application.yml`) para incluir los detalles de conexión de tu base de datos MySQL:

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3308/floristeria_app
    spring.datasource.username=tu_usuario
    spring.datasource.password=tu_contraseña
    spring.jpa.hibernate.ddl-auto=update
    ```

4. Instala las dependencias:

    ```bash
    mvn clean install
    ```

## Ejecución

1. Compila y ejecuta la aplicación:

    ```bash
    mvn spring-boot:run
    ```

2. Abre un navegador y navega a `http://localhost:8080`. Deberías ver el mensaje de bienvenida: 
    ```
    Bienvenido al Grupo Actividad 6 Evidencia: S35 - Caso de estudio – Floristería – Actividad 1
    ```

3. Para interactuar con la API de flores, usa las siguientes rutas:

    - `GET /flores`: Listar todas las flores.
    - `POST /flores`: Agregar una nueva flor (requiere un cuerpo JSON con los detalles de la flor).
    - `PUT /flores/{id}`: Actualizar una flor por su ID.
    - `DELETE /flores/{id}`: Eliminar una flor por su ID.

## Uso

### Ejemplo de JSON para agregar una flor:

```json
{
  "tipo": "Rosa",
  "color": "Rojo",
  "variedad": "Floribunda",
  "cantidadDisponible": 50,
  "precioCompra": 1.50,
  "precioVenta": 3.00
}
