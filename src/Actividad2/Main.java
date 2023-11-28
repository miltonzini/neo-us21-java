package Actividad2;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // acceder a métodos iniciales de biblioteca
        Biblioteca.precargarUsuarios();
        Biblioteca.precargarLibros();
        
        //
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
        // lógica de inicio de sesión
        // ... 

        // una vez terminado dirigiar a Menu Principal
        menuPrincipal();
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

