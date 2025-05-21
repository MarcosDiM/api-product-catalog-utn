# 📦 Product Catalog API - UTN

API RESTful desarrollada en Java utilizando Spring Boot como parte de un proyecto académico para la Tecnicatura Superior en Programación (UTN Mendoza). Este sistema permite la gestión de productos, categorías, unidades de medida e imágenes asociadas, aplicando buenas prácticas de arquitectura, persistencia de datos y relaciones entre entidades.

## 📌 Tecnologías utilizadas

- Java 17
- Spring Boot
- Hibernate / JPA
- Lombok
- Gradle
- H2 Database
- Postman (para pruebas de endpoints)

## 📖 Entidades principales

- **Base**  
  Clase base abstracta que contiene atributos comunes a todas las entidades.

- **Empresa**  
  Información de la empresa propietaria del sistema.

- **Sucursal**  
  Sucursales de la empresa.
  
- **Categoria**  
  Clasificación de los productos.

- **Articulo**  
  Entidad base abstracta para productos comercializables.
  
- **Usuario**  
  Usuarios del sistema con credenciales de acceso.
  
- **Empleado**  
  Datos de los empleados de la empresa.
  
- **Cliente**  
  Datos de los clientes del sistema.

- **Domicilio**  
  Dirección asociada a clientes, sucursales o empleados.

- **Pedido**  
  Pedido realizado por un cliente.

- **DetallePedido**  
  Detalle de los productos incluidos en un pedido.

- **Factura**  
  Registro de facturación de un pedido.

## 📫 Autor

**Marcos Di Meco**  
📧 marcosdimecom@gmail.com  
📍 Mendoza, Argentina
