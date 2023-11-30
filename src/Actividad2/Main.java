package Actividad2;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Main {
    private static Usuario usuarioActual; // Variable global para almacenar el usuario actual

    public static void main(String[] args) {
        // acceder a métodos iniciales de biblioteca
        Biblioteca.precargarUsuarios();
        Biblioteca.precargarLibros();
        
        menuInicio();

    }
    
    public static void menuInicio() {
        // Cuadro de Diálogo con opciones
        String[] opciones = {"Iniciar Sesión", "Registrarme", "Salir"};
		int seleccion = JOptionPane.showOptionDialog(
            null,
            "Inicio", 
            "App Biblioteca : ",
		    JOptionPane.DEFAULT_OPTION, 
            JOptionPane.INFORMATION_MESSAGE, 
            null, 
            opciones, 
            opciones[0]
        );
        
		
		switch (seleccion) {
		case 0:
            try {
                iniciarSesion();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: no se pudo iniciar sesión.", "Errores", JOptionPane.ERROR_MESSAGE);
            }
			break;
		case 1:
            try {
                registrarUsuario();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: no se pudo iniciar sesión.", "Errores", JOptionPane.ERROR_MESSAGE);
            }
			break;
		case 2:
			System.exit(0);
			break;
		default:
			break;
		}
    }

    public static void iniciarSesion() {
        // Lista con errores de validación
        List<String> loginValidationErrors = new ArrayList<>();

        // Ingresar y validar email
        String emailIngresado = JOptionPane.showInputDialog("Ingresar email:");
        Usuario usuarioEncontrado = null;

        if (emailIngresado.isEmpty()) {
            loginValidationErrors.add("El campo 'email' se encuentra vacío");
        } else if (!emailIngresado.contains("@")) {
            loginValidationErrors.add("El email ingresado no es válido, debe contener '@'");
        } else {
            // Verificar si el email existe en la lista de usuarios
            ArrayList<Usuario> listadoUsuarios = Biblioteca.getListadoUsuarios();
            boolean emailExistente = false;
            for (Usuario usuario : listadoUsuarios) {
                if (usuario.getEmail().equals(emailIngresado)) {
                    emailExistente = true;
                    usuarioEncontrado = usuario;
                    break;
                }
            }
    
            if (!emailExistente) {
                loginValidationErrors.add("El email ingresado no existe");
            }
        }
        
        // Ingresar y validar contraseña (si no hay errores en el paso anterior)
        if (loginValidationErrors.isEmpty()) {
            String contrasenaIngresada = JOptionPane.showInputDialog("Ingresar Contraseña:");
            
            if (contrasenaIngresada.isEmpty()) {
                loginValidationErrors.add("El campo 'contraseña' se encuentra vacío");
            } else if (emailIngresado.length() < 8 ) {
                loginValidationErrors.add("La contraseña debe contener al menos 8 caracteres");
            } else {
                // chequear si la contraseña ingresada coincide con la que figura en el usuario existente
                String contrasenaUsuario = usuarioEncontrado.getContrasena();
                if (!contrasenaIngresada.equals(contrasenaUsuario)) {
                    loginValidationErrors.add("La contraseña ingresada no es correcta");
                }
            }
        }
        
        // si hay errores, imprimirlos y volver a iniciarSesion(). Si no hay errores se pasa el menu Principal
        if (!loginValidationErrors.isEmpty()) {
            // Imprimir errores y volver a iniciarSesion()
            StringBuilder mensajeErrores = new StringBuilder("Se encontraron errores:\n");
            for (String error : loginValidationErrors) {
                mensajeErrores.append("- ").append(error).append("\n");
            }
            JOptionPane.showMessageDialog(null, mensajeErrores.toString(), "Errores", JOptionPane.ERROR_MESSAGE);

            iniciarSesion();
            
            
        } else {
            usuarioActual = usuarioEncontrado;
            JOptionPane.showMessageDialog(null, "Sesión iniciada", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            menuPrincipal();
        }
    }

    public static void registrarUsuario() {
        List<String> registerValidationErrors = new ArrayList<>();
        
        // ingresar y validar email
        String emailIngresado = JOptionPane.showInputDialog("Ingresar email:");
        if (emailIngresado.isEmpty()) {
            registerValidationErrors.add("El campo 'email' se encuentra vacío");
        } else if (!emailIngresado.contains("@")) {
            registerValidationErrors.add("El email ingresado no es válido, debe contener '@'");
        } else {
            // Verificar si el email existe en la lista de usuarios
            ArrayList<Usuario> listadoUsuarios = Biblioteca.getListadoUsuarios();
            boolean emailExistente = false;
            for (Usuario usuario : listadoUsuarios) {
                if (usuario.getEmail().equals(emailIngresado)) {
                    emailExistente = true;
                    break;
                }
            }
            if (emailExistente) {
                registerValidationErrors.add("El email ingresado ya existe");
            }
        }

        // ingresar y validar contraseña
        String contrasenaIngresada = JOptionPane.showInputDialog("Ingresar Contraseña:");
        
        if (contrasenaIngresada.isEmpty()) {
            registerValidationErrors.add("El campo 'contraseña' se encuentra vacío");
        } else if (contrasenaIngresada.length() < 8 ) {
            registerValidationErrors.add("La contraseña debe contener al menos 8 caracteres");
        } 
        
        // ingresar y validar nombre
        String nombreIngresado = JOptionPane.showInputDialog("Ingresar Nombre:");
        if (nombreIngresado.isEmpty()) {
            registerValidationErrors.add("El campo 'nombre' se encuentra vacío");
        }

        // ingresar y validar apellido
        String apellidoIngresado = JOptionPane.showInputDialog("Ingresar Apellido:");
        if (apellidoIngresado.isEmpty()) {
            registerValidationErrors.add("El campo 'apellido' se encuentra vacío");
        }
        
        // ingresar y validar dni
        String dniIngresado = JOptionPane.showInputDialog("Ingresar DNI:");
        if (!dniIngresado.matches("\\d{8}")) {
            registerValidationErrors.add("El DNI debe contener exactamente 8 números");
        }
        
        



        // si hay errores, imprimirlos y volver a iniciarSesion(). Si no hay errores, instanciar usuario e ir al menu Principal
        if (!registerValidationErrors.isEmpty()) {
            // Imprimir errores y volver a registrarUsuario()
            StringBuilder mensajeErrores = new StringBuilder("Se encontraron errores:\n");
            for (String error : registerValidationErrors) {
                mensajeErrores.append("- ").append(error).append("\n");
            }
            JOptionPane.showMessageDialog(null, mensajeErrores.toString(), "Errores", JOptionPane.ERROR_MESSAGE);
        
            registrarUsuario();
            
        } else {
            // instanciar Usuario con los datos ingresados
            Usuario nuevoUsuario = new Usuario(dniIngresado, nombreIngresado, apellidoIngresado, emailIngresado, contrasenaIngresada, false);
            Biblioteca.agregarNuevoUsuario(nuevoUsuario);
            JOptionPane.showMessageDialog(null, "usuario registrado con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            Biblioteca.imprimirListadoUsuarios(); // temp
            
            usuarioActual = nuevoUsuario;
            menuPrincipal();
        }
    
    }

    
    public static void menuPrincipal() {
        String[] opciones = {"Buscar Libro", "Agregar Nuevo Libro", "Alquilar Libro", "Devolver Libro", "Informe Completo", "Salir"};
		int seleccion = JOptionPane.showOptionDialog(
            null,
            "Menú Principal", 
            "Menú Principal: ",
		    JOptionPane.DEFAULT_OPTION, 
            JOptionPane.INFORMATION_MESSAGE, 
            null, 
            opciones, 
            opciones[0]
        );
        
		
		switch (seleccion) {
		case 0:
            try {
                buscarLibro();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: no se pudo buscar libro.", "Errores", JOptionPane.ERROR_MESSAGE);
            }
			break;
		case 1:
            try {
                agregarLibro();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: no se pudo agregar libro.", "Errores", JOptionPane.ERROR_MESSAGE);
            }
			break;
		case 2:
            try {
                alquilarLibro();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: no se pudo alquilar libro.", "Errores", JOptionPane.ERROR_MESSAGE);
            }
			break;
        case 3:
            try {
                devolverLibro();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: no se pudo devolver libro.", "Errores", JOptionPane.ERROR_MESSAGE);
            }
			break;
        case 4:
            try {
                informeCompleto();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: no se pudo acceder al informe.", "Errores", JOptionPane.ERROR_MESSAGE);
            }
			break;
        case 5:
			System.exit(0);
			break;
		default:
			break;
		}
    }

    

    public static void buscarLibro() {
        // mostrar opciones
        String[] opciones = {"Por Título", "Por Autor", "Por Género"};
		int seleccion = JOptionPane.showOptionDialog(
            null,
            "Opciones", 
            "Elija un criterio para la búsqueda : ",
		    JOptionPane.DEFAULT_OPTION, 
            JOptionPane.INFORMATION_MESSAGE, 
            null, 
            opciones, 
            opciones[0]
        );
        
		
		switch (seleccion) {
		case 0:
            // Buscar libro por título
            String tituloLibro = JOptionPane.showInputDialog("Ingresar título del libro:");
			if (Biblioteca.buscarLibroPorTitulo(tituloLibro)) {
                JOptionPane.showMessageDialog(null, "El libro está en el catálogo", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                menuPrincipal();
            } else {
                JOptionPane.showMessageDialog(null, "El libro no está en el catálogo", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                menuPrincipal();
            };
			break;
            
		case 1:
            String autorLibro = JOptionPane.showInputDialog("Ingresar autor del libro:");
            if (Biblioteca.buscarLibroPorAutor(autorLibro)) {
                JOptionPane.showMessageDialog(null, "Hay libros del autor indicado en catálogo", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                menuPrincipal();
            } else {
                JOptionPane.showMessageDialog(null, "No hay libros del autor indicado en catálogo", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                menuPrincipal();
            };
			break;
		case 2:
			String generoLibro = JOptionPane.showInputDialog("Ingresar género del libro:");
			 if (Biblioteca.buscarLibroPorGenero(generoLibro)) {
                JOptionPane.showMessageDialog(null, "Hay libros del género indicado en catálogo", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                menuPrincipal();
            } else {
                JOptionPane.showMessageDialog(null, "No hay libros del género indicado en catálogo", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                menuPrincipal();
            };
			break;
		default:
			break;
		}


    }

    public static void agregarLibro() {
        String nombreLibro = JOptionPane.showInputDialog("Ingresar nombre del libro:");
        String autorLibro = JOptionPane.showInputDialog("Ingresar autor del libro:");
        String generoLibro = JOptionPane.showInputDialog("Ingresar género del libro:");

        Libro nuevoLibro = new Libro(nombreLibro, autorLibro, generoLibro, true, null);
        Biblioteca.agregarNuevoLibro(nuevoLibro);
        JOptionPane.showMessageDialog(null, "libro registrado con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        Biblioteca.imprimirListadoLibros(); // temp

        
    }

    public static void alquilarLibro() {
        String tituloLibro = JOptionPane.showInputDialog("Ingresar título del libro:");
        Libro libroActual = Biblioteca.getLibro(tituloLibro);
    
        if (libroActual != null) {
            if (libroActual.getDisponible()) {
                if (!usuarioActual.getPoseeLibro()) {
                    usuarioActual.setPoseeLibro(true);
                    libroActual.setDisponible(false);
                    libroActual.setAlquiladoDNI(usuarioActual.getDni());
                    Biblioteca.imprimirInfoCompleta(); // temp debug
                    JOptionPane.showMessageDialog(null, "Has alquilado '" + libroActual.getTitulo() + "' exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Ya tienes un préstamo en curso, no puedes alquilar más libros.", "Info", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "El libro que deseas alquilar no está disponible.", "Info", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "El libro no está en el catálogo", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    
        Biblioteca.imprimirInfoCompleta(); // temp
        menuPrincipal();
    }
    
        
        
    

    public static void devolverLibro() {
        if (usuarioActual.getPoseeLibro() != null) {
            usuarioActual.setPoseeLibro(null);

            Libro libroActual = Biblioteca.getLibroPorAlquiladoDni(usuarioActual.getDni());
            libroActual.setAlquiladoDNI(null);
            libroActual.setDisponible(true);
            
            JOptionPane.showMessageDialog(null, "has devuelto '" + libroActual.getTitulo() + "'.", "Info", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "usted no tiene libros alquilados.", "Info", JOptionPane.ERROR_MESSAGE);
        }
        menuPrincipal();
    }

    public static void informeCompleto() {        
        List<Libro> listadoLibros = Biblioteca.getListadoLibros();
        List<Usuario> listadoUsuarios = Biblioteca.getListadoUsuarios();
        
        StringBuilder mensajeLibros = new StringBuilder("Listado Libros:\n");

        listadoLibros.forEach(libro -> {
            String disponibilidad = "";
            if (libro.getDisponible() == true) {
                disponibilidad = "(Disponible)";
            } else {
                disponibilidad = "(No disponible)";
            }
            mensajeLibros.append(" - " + libro.getTitulo() + " (" + libro.getAutor() + ")" + " | " +  disponibilidad + "\n");
        });

        StringBuilder mensajeUsuarios = new StringBuilder("Listado Usuarios:\n");

        listadoUsuarios.forEach(usuario -> {
            mensajeUsuarios.append(" - " + usuario.getNombre() + " " + usuario.getNombre() + " | DNI: " +  usuario.getDni() + ".\n");
        });

        JOptionPane.showMessageDialog(null, mensajeLibros.toString() + "\n\n" + mensajeUsuarios.toString(), "Informe", JOptionPane.INFORMATION_MESSAGE);

        menuPrincipal();

    }
}

