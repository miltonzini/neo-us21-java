package Actividad1;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        mostrarOpciones();
    }
    public static void mostrarOpciones() {
        String[] opciones = {"Agregar Persona", "Listar Personas", "Salir"};
		int seleccion = JOptionPane.showOptionDialog(
            null,
            "Menu", 
            "Registro: ",
		    JOptionPane.DEFAULT_OPTION, 
            JOptionPane.INFORMATION_MESSAGE, 
            null, 
            opciones, 
            opciones[0]
        );
        
		
		switch (seleccion) {
		case 0:
			agregarPersona();
			break;
		case 1:
			listarPersonas();
			break;
		case 2:
			System.exit(0);
			break;
		default:
			break;
		}

    }
    public static void agregarPersona() {
        String nombre = JOptionPane.showInputDialog("Ingresar nombre:");
		String apellido = JOptionPane.showInputDialog("Ingresar apellido:");
        String dni = JOptionPane.showInputDialog("Ingresar DNI:");
        String fechaDeNacimiento = JOptionPane.showInputDialog("Ingresar Fecha de nacimiento (formato dd/mm/yyyy):");
        

        // # validación
        List<String> validationErrors = new ArrayList<>();
        if (nombre.isEmpty()) {
            validationErrors.add("el campo 'nombre' está vacío");
        }
        if (apellido.isEmpty()) {
            validationErrors.add("el campo 'apellido' está vacío");
        }
        if (!dni.matches("\\d{8}")) {
            // Si no tiene 8 dígitos numéricos, agregar un mensaje al array de errores
            validationErrors.add("El campo DNI debe contener exactamente 8 números");
        }
        String regexFecha = "\\d{2}/\\d{2}/\\d{4}";
        if (!fechaDeNacimiento.matches(regexFecha)) {
            validationErrors.add("El formato de fecha debe ser dd/mm/yyyy");
        }

        if (validationErrors.isEmpty()) {
            // No hay errores, continuar con el procesamiento [CONTINUAR]
            
        } else {
            // Mostrar los mensajes de error en un cuadro de diálogo
            StringBuilder mensajeErrores = new StringBuilder("Se encontraron errores:\n");
            for (String error : validationErrors) {
                mensajeErrores.append("- ").append(error).append("\n");
            }
            JOptionPane.showMessageDialog(null, mensajeErrores.toString(), "Errores", JOptionPane.ERROR_MESSAGE);
        }


    }


    public static void listarPersonas() {
        // pending
    }
}

