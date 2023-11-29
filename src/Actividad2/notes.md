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
-en Main, llamar a métodos iniciales de Biblioteca [ok]
-- crear Listas listadoUsuarios y listadoLibros. 
-- precargar algunos libros de ejemplo [ok]
-- precargar usuarios de ejemplo [ok]
-luego
-- usar un menú con JOptions con las siguientes jerarquía de opciones ["menuInicio()"]: [~~]
---- 1) Iniciar sesión [ok]
------ se solicita al usuario el email y la contrasena, se validan los datos ["validarUsuario()"] y se instancia un nuevo Usuario [ok]
------ se muestra mensaje de éxito y se llama al Menú Principal
--------- a) "buscarLibro()": 
----------- se da la opción de elegir por título, autor o género. 
------------- si se encontró, mostrar info del libro ["mostrarInfoLibro()"].
--------------- si está disponible mostrar opciónes alquilarLibro() o menuPrincipal()
--------------- si no está disponible mostrar mensaje ["mensajeError('libro no disponible')"] y volver a menuPrincipal()
------------- si no se encontró, mostrar mensaje ["mensajeError('no se encontró el libro')"] y volver a menuPrincipal()
--------- b) agregarLibro()
------------- se solicita secuencialmente titulo, autor y género
--------- c) alquilarLibro()
------------- se solicita el nombre y se busca en el listado
---------------- si existe, se cheuquea disponibilidad ("verDisponibilidad(libro)")
--------------------- si está disponible, se muestra mensaje de success y se redirige a menuPrincipal().
--------------------- si no está disponible, se muestra mensaje de error y se redirige a menuPrincipal().
---------------- si no existe, se vuelve mensaje de error y se redirige al menú
--------- d) devolverLibro()
------------ se chequea si el usuario tiene libros en su poder.
---------------- si es true, imprimir mensajeSuccess"has devuelto el libro: '' ") y redrigir a menuPrincipal().
---------------- si es false, imprimir mensajeError("no adeudas ningún libro") y redrigir a menuPrincipal().
--------- e) Salir
---- 2) Registrarme [registrarUsuario()]: se validan los datos  [ok]
--------- si hay error se muestra el mensaje correspondiente y se vuelve a registrarUsuario()  
--------- si es success, se redirige a menuPrincipal() [ok]
---- 3) Salir. [ok]


-Clases a crear: 
----- Main  [~~~]
--------- llama a precarga los datos iniciales y llama a menuInicio()
----- Biblioteca [~~~]
--------- contiene las listas de libros y usuarios
----- Usuario [ok]
--------- atributos: dni, nombre, apellido, email, contrasena, poseeLibro 
----- Libro [ok]
--------- atributos: ID, título, autor, género, estado(noDisponible|disponible), alquiladoDNI