package Actividad2;

import java.util.ArrayList;

public class Biblioteca {
    private static ArrayList<Usuario> listadoUsuarios = new ArrayList<>();
    private static ArrayList<Libro> listadoLibros = new ArrayList<>();

    public static void precargarUsuarios() {
        // precargar usuarios de ejemplo
        listadoUsuarios.add(new Usuario("20983245", "Carlos", "Gomez", "carlos@ejemplo.com", "carlos123", false));
        listadoUsuarios.add(new Usuario("38123546", "Ana", "Díaz", "anadiaz@ejemplo.com", "conejo", false));
        listadoUsuarios.add(new Usuario("40123654", "Lucas", "Lucero", "mail@mail.com", "conejo", true));
        listadoUsuarios.add(new Usuario("12345678", "Homero", "Simpson", "asd@asd.com", "conejo", true));

        // imprimirListadoUsuarios();
    }

    public static void precargarLibros() {
        // precargar libros de ejemplo
        listadoLibros.add(new Libro("El Aleph", "Jorge Luis Borges", "no especificado", true, null));
        listadoLibros.add(new Libro("Rayuela", "Julio Cortazar", "novela", false, "40123654"));
        listadoLibros.add(new Libro("El Tunel", "Ernesto Sábato", "novela", true, null));
        listadoLibros.add(new Libro("La Odisea", "Homero", "no especificado", false, "12345678"));
    }

    public static void agregarNuevoUsuario(Usuario nuevoUsuario) {
        listadoUsuarios.add(nuevoUsuario);
    }

    public static void agregarNuevoLibro(Libro nuevoLibro) {
        listadoLibros.add(nuevoLibro);
    }

    public static Libro getLibro(String tituloLibro) {
        ArrayList<Libro> listadoLibros = getListadoLibros();
        Libro libroEncontrado = null;
        for (Libro libro : listadoLibros) {
            if (libro.getTitulo().equals(tituloLibro)) {
                libroEncontrado = libro;
                break;
            }
        }
        return libroEncontrado;
    
    }

    public static Libro getLibroPorAlquiladoDni(String dni) {
        ArrayList<Libro> listadoLibros = getListadoLibros();
        Libro libroEncontrado = null;
        for (Libro libro : listadoLibros) {            
            if (libro.getAlquiladoDNI() != null) {
                if (libro.getAlquiladoDNI().equals(dni)) {
                    libroEncontrado = libro;
                    break;
                }
            }
        }
        return libroEncontrado;
    
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
        ArrayList<Libro> listadoLibros = getListadoLibros();
        boolean bool = false;
        for (Libro libro : listadoLibros) {
            if (libro.getGenero().equals(generoLibro)) {
                bool = true;
                break;
            } else {
                bool = false;
            }
        }
        return bool;
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

    public static void imprimirInfoCompleta() { // (temp method for debugging)
        System.out.println("------------------------------------");
        System.out.println("Catálogo de Libros:");
        for (Libro libro : listadoLibros) {
            System.out.println(" - " + libro.getTitulo() + " (" + libro.getAutor() + "). | Disponible?: " + libro.getDisponible() + "." );
        }
        System.out.println("  ");
        System.out.println("  ");

        System.out.println("Listado Usuarios Registrados:");
        for (Usuario usuario : listadoUsuarios) {
            System.out.println(" - " + usuario.getNombre() + " " + usuario.getApellido() + " | Posee Libro?: " + usuario.getPoseeLibro() + ".");
        }
        System.out.println("------------------------------------");
    }
}
