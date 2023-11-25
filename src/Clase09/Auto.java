package Clase09;

/*
Establecemos el nombre de la clase raiz que será instanciada
por el objeto a crear
 */


public class Auto {
    /*
    marca
    color
    modelo
     */
    //Atributos
    String marca;

    String modelo;

    String color;

    //Instanciamos el nombre de la clase
    public Auto(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    //Métodos o funcionamiento
    public void acelerar() {
        System.out.println("El auto " + marca  + " " + modelo + " de color "  + color + " está acelerando ");
    }

    public void frenar() {
         System.out.println("El auto " + marca  + " " + modelo + " de color "  + color + " está frenando ");
    }
 
}
