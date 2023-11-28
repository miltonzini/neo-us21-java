package Actividad2;

import java.util.ArrayList;

public class Biblioteca {
    private static ArrayList<Usuario> listadoUsuarios = new ArrayList<>();

    public static void precargarUsuarios() {
        // precargar usuarios de ejemplo
        listadoUsuarios.add(new Usuario("20983245", "Carlos", "Gomez", "carlos@ejemplo.com", "carlos123", false));
        listadoUsuarios.add(new Usuario("38123546", "Ana", "Díaz", "anadiaz@ejemplo.com", "conejo", false));
    }

    public static void precargarLibros() {
        System.out.println("se precargan los libros"); // TODO
        // crear lista para libros
        // instanciar Libro varias veces
    }



    public static void imprimirListadoUsuarios() { // TODO: convertir a getter
        System.out.println("--------------------------"); 
        System.out.println("Listado Usuarios Registrados:");
        for (Usuario usuario : listadoUsuarios) {
            System.out.println(usuario.getNombre() + " " + usuario.getApellido());
        }
        System.out.println("--------------------------");
    }



}
