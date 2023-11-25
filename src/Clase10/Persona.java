package Clase10;

//Creamos una clase destinada a realizar el objeto Persona
public class Persona {
    //Establecemos los 
    //atributos/caracteristicas
    //Palabra reservada private genera un escapsulamiento
    private int edad;

    private final String nombre;

    private String apellido;

    private String direccion;

    private double altura;

    public Persona(int edad, String nombre, String apellido, String direccion, double altura) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.altura = altura;
    }
    
    //Método setter -> establecemos la edad
    public void setEdad(int edad){
        this.edad = edad;
    }
    //Método getter -> Obtener la edad
    public int getEdad(){
        return edad;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void mostrarDatos() {
        System.out.println("El nombre es: " + nombre + ", su Apellido es: " + apellido);
        System.out.println("Tiene la edad de: " + getEdad() + ", su dirección de domicilio es: " + direccion);
        System.out.println("Tiene una altura de " + altura);
    }
}
