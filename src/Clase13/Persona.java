package Clase13;

//Declaramos la clase abstract
public abstract class Persona {
    private String nombre;
    
    private int edad;
    
    public Persona (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //Establecemos y obtenemos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //Métodos abstractos
    public abstract void saludar();
    
    public abstract void trabajar();
    
    public void presentarse(){
        System.out.println("Hola soy " + nombre + " y tengo " + edad + " años");
    }

}
