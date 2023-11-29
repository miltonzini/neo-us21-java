package Actividad2;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Main {
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
			iniciarSesion();
			break;
		case 1:
			registrarUsuario();
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
        if (registerValidationErrors.isEmpty()) {
            String contrasenaIngresada = JOptionPane.showInputDialog("Ingresar Contraseña:");
            
            if (contrasenaIngresada.isEmpty()) {
                registerValidationErrors.add("El campo 'contraseña' se encuentra vacío");
            } else if (contrasenaIngresada.length() < 8 ) {
                registerValidationErrors.add("La contraseña debe contener al menos 8 caracteres");
            } 
        } 
        
        // TODO
        // ingresar y validar nombre
        if (registerValidationErrors.isEmpty()) {
            String nombreIngresado = JOptionPane.showInputDialog("Ingresar email:");
            if (nombreIngresado.isEmpty()) {
                registerValidationErrors.add("El campo 'nombre' se encuentra vacío");
            }
        } 

        // ingresar y validar apellido
        // ... 

        // ingresar y validar dni
        // ... 

        // instanciar Usuario con los datos ingresados
        // ...



        // si hay errores, imprimirlos y volver a iniciarSesion(). Si no hay errores se pasa el menu Principal
        if (!registerValidationErrors.isEmpty()) {
            // Imprimir errores y volver a registrarUsuario()
            StringBuilder mensajeErrores = new StringBuilder("Se encontraron errores:\n");
            for (String error : registerValidationErrors) {
                mensajeErrores.append("- ").append(error).append("\n");
            }
            JOptionPane.showMessageDialog(null, mensajeErrores.toString(), "Errores", JOptionPane.ERROR_MESSAGE);
        
            registrarUsuario();
            
        } else {
            JOptionPane.showMessageDialog(null, "usuario registrado con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            menuPrincipal();
        }
    
    }

    
    
    public static void menuPrincipal() {
        // TODO: complete this method
        JOptionPane.showMessageDialog(null, "Este es el Menú Principal", "Menú Principal", JOptionPane.INFORMATION_MESSAGE);
    }
}

