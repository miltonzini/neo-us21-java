package Actividad2;

import java.util.ArrayList;

public class Biblioteca {
    private static ArrayList<Usuario> listadoUsuarios = new ArrayList<>();
    private static ArrayList<Libro> listadoLibros = new ArrayList<>();

    public static void precargarUsuarios() {
        // precargar usuarios de ejemplo
        listadoUsuarios.add(new Usuario("20983245", "Carlos", "Gomez", "carlos@ejemplo.com", "carlos123", false));
        listadoUsuarios.add(new Usuario("38123546", "Ana", "Díaz", "anadiaz@ejemplo.com", "conejo", false));

        // imprimirListadoUsuarios();
    }

    public static void precargarLibros() {
        // precargar libros de ejemplo
        listadoLibros.add(new Libro(00, "El Aleph", "Jorge Luis Borges", "no especificado", true, null));
        listadoLibros.add(new Libro(01, "Rayuela", "Julio Cortazar", "novela", true, null));
        listadoLibros.add(new Libro(02, "El Tunel", "Ernesto Sábato", "novela", true, null));
    }

    public static void agregarNuevoUsuario(Usuario nuevoUsuario) {
        listadoUsuarios.add(nuevoUsuario);
    }

    public static ArrayList<Usuario> getListadoUsuarios() {
        return listadoUsuarios;
    }    

    public static ArrayList<Libro> getListadoLibros() {
        return listadoLibros;
    }

    public static boolean buscarLibroPorTitulo(String tituloLibro) {
        ArrayList<Libro> listadoLibros = getListadoLibros();
        boolean bool = false;
        for (Libro libro : listadoLibros) {
            if (libro.getTitulo().equals(tituloLibro)) {
                bool = true;
                break;
            } else {
                bool = false;
            }
        }
        return bool;
    }

    public static boolean buscarLibroPorAutor(String autorLibro) {
        ArrayList<Libro> listadoLibros = getListadoLibros();
        boolean bool = false;
        for (Libro libro : listadoLibros) {
            if (libro.getAutor().equals(autorLibro)) {
                bool = true;
                break;
            } else {
                bool = false;
            }
        }
        return bool;
    }

    public static boolean buscarLibroPorGenero(String generoLibro) {
        // ...
        return false; // temp
    }

    

    // TODO: clean up temp methods

    public static void imprimirListadoUsuarios() { // (temp method for debugging)
        System.out.println("------------------------------------");
        System.out.println("Listado Usuarios Registrados:");
        for (Usuario usuario : listadoUsuarios) {
            System.out.println(usuario.getNombre() + " " + usuario.getApellido());
        }
        System.out.println("------------------------------------");
    }

    public static void imprimirListadoLibros() { // (temp method for debugging)
        System.out.println("------------------------------------");
        System.out.println("Catálogo de Libros:");
        for (Libro libro : listadoLibros) {
            System.out.println(" - " + libro.getTitulo() + " (" + libro.getAutor() + ").");
        }
        System.out.println("------------------------------------");
    }
}
