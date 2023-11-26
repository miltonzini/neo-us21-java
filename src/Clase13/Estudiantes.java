package Clase13;

public class Estudiantes extends Persona{
    private final String carrera;

    public Estudiantes(String nombre, int edad,  String carrera) {
        super(nombre, edad);
        this.carrera = carrera;
    }

    @Override
    public void saludar() {
        System.out.println("Hola soy " + getNombre() + " y estudio en la carrera de " + carrera);
    }

    @Override
    public void trabajar() {
        System.out.println("Estoy estudiando para viajar a Punta Cana");
    }

}
