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

        if (emailIngresado.isEmpty()) {
            loginValidationErrors.add("El campo email se encuentra vacío");
        } else if (!emailIngresado.contains("@")) {
            loginValidationErrors.add("El email ingresado no es válido, debe contener '@'");
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
            if (!emailExistente) {
                loginValidationErrors.add("El email ingresado no existe");
            }

        }

        
        // Ingresar y validar contraseña
        // ...
    }

    public static void registrarUsuario() {
        // lógica de registro de usuario
        // ... 

        // una vez terminado dirigiar a Menu Principal
        menuPrincipal();
    }

    
    
    public static void menuPrincipal() {
        
    }
}

