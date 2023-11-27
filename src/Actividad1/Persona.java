package Actividad1;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    private LocalDate fechaDeNacimiento;

    public Persona(String nombre, String apellido, String dni, LocalDate fechaDeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
}