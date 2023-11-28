# CONSIGNA: CREACIÓN DE UNA APLICACIÓN DE BIBLIOTECA

## Descripción de la actividad

Los estudiantes deben crear una aplicación de biblioteca en Java que cumpla con los siguientes requisitos:

## Requisitos Funcionales:
1. Gestión de Libros:
   - Los usuarios pueden agregar nuevos libros a la biblioteca. // [contemplado en pseudocódigo]
   - Los usuarios pueden eliminar libros de la biblioteca. // [contemplado en pseudocódigo]
2. Gestión de Usuarios:
   - Los usuarios pueden registrarse en el sistema. // [contemplado en pseudocódigo]
   - Los usuarios pueden alquilar libros. // [contemplado en pseudocódigo]
   - Los usuarios deben devolver los libros // [contemplado en pseudocódigo]
4. Consultas y Búsquedas:
   - Los usuarios pueden buscar libros en la biblioteca por título, autor o género. // [contemplado en pseudocódigo]
5. Informes y Estadísticas:
   - Los usuarios pueden generar informes o estadísticas sobre el uso de la biblioteca. // [contemplado en pseudocódigo]

## Requisitos Técnicos:
- Utilizar programación orientada a objetos para diseñar las clases y objetos necesarios. // [contemplado en pseudocódigo]
- Implementar manejo de excepciones para situaciones como devoluciones fuera de plazo o búsqueda de libros inexistentes. // !!
- Utilizar interfaces y clases abstractas para definir un sistema de notificación a los usuarios. // [pendiente]
- Aplicar programación funcional y Streams para consultas y generación de informes o estadísticas simples. // [pendiente]





# PSEUDOCÓDIGO / NOTAS
-en Main: 
-- crear bibliotecas listadoUsuarios y listadoLibros. 
-- precargar algunos libros de ejemplo
-- precargar un usuario de ejemplo
-- usar un menú con JOptions con las siguientes jerarquía de opciones:
---- 1) Iniciar sesión
------ se solicita al usuario el email y la contrasena, se validan los datos ["validarUsuario()"] y se instancia un nuevo Usuario
------ se saluda al usuario y se le muestran las opciones principales
--------- a) "buscarLibro()": 
----------- se da la opción de elegir por título, autor o género. 
------------- si se encontró, mostrar info del libro ["mostrarInfoLibro()"].
--------------- si está disponible mostrar opciónes alquilarLibro() o menuPrincipal()
--------------- si no está disponible mostrar mensaje ["mensajeError('libro no disponible')"] y volver a menuPrincipal()
------------- si no se encontró, mostrar mensaje ["mensajeError('no se encontró el libro')"] y volver a menuPrincipal()
--------- b) agregarLibro()
--------- c) alquilarLibro()
--------- d) devolverLibro()
--------- e) Salir
---- 2) Registrarse: se validan los datos y se muestran las mismas opciones principales
---- 3) Salir.


-Clases a crear: 
----- Main
----- Biblioteca
----- Persona
--------- atributos: dni, nombre, apellido, email, contrasena, poseeLibro
----- Libro
--------- atributos: ID, título, autor, género, estado(noDisponible|disponible), alquiladoDNI