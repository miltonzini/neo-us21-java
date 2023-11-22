package Clase05;

import javax.swing.JOptionPane;

public class Clase05 {
    public static void main(String[] args) {
        /*         
        //Ejemplo1: solicitar 1 número y verificar si es par o impar
        
        //Solicitar al usuairo que ingrese un número y guardarlo en una variable
        
        String numeroString = JOptionPane.showInputDialog("Ingrese un número");
        
        int numero = Integer.parseInt(numeroString);
        
        //Comprobar si el numero es par o impar
        
        if( numero % 2 == 0 ){
            JOptionPane.showMessageDialog(null, "El numero es par");
        }else{
            JOptionPane.showMessageDialog(null, "El numero es impar");
        }
        */
         

        /* 
       //Ejemplo 2: pedir un número y chequear si <= 70
       
       String calificacion = JOptionPane.showInputDialog("Ingrese un número");
       
       int nota = Integer.parseInt(calificacion);
       
       if( nota >= 70 ){
           JOptionPane.showMessageDialog(null, "Tu examen fue aprobado");
       }else{
           JOptionPane.showMessageDialog(null, "Tu examen fue desaprobado");
       }
       */

       /*
       // Ejemplo 3: solicitar 3 números e imprimir el mayor
       
       String num1 = JOptionPane.showInputDialog("Ingrese el primer número");
       
       String num2 = JOptionPane.showInputDialog("Ingrese el segundo número");
       
       String num3 = JOptionPane.showInputDialog("Ingrese el tercer número");
      
       //Inicializar una variable para almacenar el número mayor 
       int mayor = Integer.parseInt(num1);
       
       //Comprobar si el segundo número es mayor que el actual número mayor
       if( Integer.parseInt(num2) > mayor ){
           mayor = Integer.parseInt(num2);
       }
       
       //Comprobar si el tercer número es mayor que el numero mayor
       if( Integer.parseInt(num3) > mayor ){
           mayor = Integer.parseInt(num3);
       }
       
       JOptionPane.showMessageDialog(null, "El número mayor es: " + mayor);
        */
        
        // Ejemplo 4: Solicitar 2 números y una operación, luego realizarla
        
        //Solicitamos 2 numeros y una operacion
        String num1 = JOptionPane.showInputDialog("Ingrese el primer número");

        String num2 = JOptionPane.showInputDialog("Ingrese el segundo número");

        String operacion = JOptionPane.showInputDialog("Ingrese la operacion a realizar");

        //Inicializar una variable para el resultado
        double resultado = 0;

        //Realizar la operacion correspondiente según la entrada del usuario
        
        switch (operacion) {
            case "+" ->
                resultado = Double.parseDouble(num1) + Double.parseDouble(num2);
            case "-" ->
                resultado = Double.parseDouble(num1) - Double.parseDouble(num2);
            case "/" ->
                resultado = Double.parseDouble(num1) / Double.parseDouble(num2);
            case "*" ->
                resultado = Double.parseDouble(num1) * Double.parseDouble(num2);
            default ->
                JOptionPane.showMessageDialog(null, "Error en la operacion");
        }
        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
         
    }

}
