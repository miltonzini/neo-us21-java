package Clase11;

public class Estudiantes extends Persona{
    //Atributos de un estudiante
    
    private String carrera;
    
    private int legajo;
    
    private int anio;
    
    public Estudiantes(String nombre, String apellido, int edad, String carrera, int legajo, int anio){
        super(nombre, apellido, edad);
        this.carrera = carrera;
        this.legajo = legajo;
        this.anio = anio;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: "+ getNombre() + "\nApellido: " + getApellido() + "\nEdad: " + getEdad() + "\nCarrera a anotarse: " + carrera + "\nLegajo número: " + legajo + "\nAño: " + anio);
    }
}
