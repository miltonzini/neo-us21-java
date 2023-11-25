package Clase08;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Clase08 {
    public static void main(String[] args){
        /*
        HashMap: es una implementación de la interfaz Map en Java.
        Representa un mapa basado en una estructura de tabla de dispersión,
        lo que significa que organiza los elementos en cubteas utizando la función hash de
        las clases. Nos proporciona un rendimiento rápido para operaciones de inserción,
        eliminación y búsqueda
        */
        //Ejemplo 1 - HashMap básico
        //Crear un HashMap, agregar elementos y mostrarlo
        
        Map<String, Integer > miMapa = new HashMap<>();
        
        miMapa.put("Uno", 1);
        miMapa.put("Dos", 2);
        
        System.out.println("Ejemplo 1: " + miMapa);
        
        //Ejemplo 2: Acceder a un valor por clave
        //Obtener el valor asociado a la clave "Dos"
        int value = miMapa.get("Dos");
        System.out.println("value = " + value);
        
        
        //Ejemplo 3 - Verificar si una clave existe
        //Verificar si la clave "Tres" está presente en el mapa
        
        boolean containsKey = miMapa.containsKey("Tres");
        
        System.out.println("containsKey = " + containsKey);
        
        //Ejemplo4: Iterar sobre las claves y valores
        //Mostrar todas las claves y valores del mapa
        
        for( Map.Entry<String, Integer> entry : miMapa.entrySet()){
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }
        
        //Ejemplo 5:
        
        //Declarar un LinkedHashMap, agregar 2 pares de clave valor y e imprimir este LinkedHashMap
        
        //LinkedHashMap: es una implementación de la interfaz Map
        //que mantiene el orden inserción de las claves. A diferencia del HashMap,
        //donde el orden no está ganrantizado, LHM conserva el orden en que se insertaron
        //las entradas
        
        Map<String, Integer> miLink = new LinkedHashMap<>();
        
        miLink.put("Tres", 3);
        miLink.put("Cuatro", 4);
        System.out.println("Ejemplo 5: " + miLink);
        
        //Ejemplo 6: TreeMap para ordenar las claves
        //Utilizar un TreeMap para ordenar las claves de forma natural
        
        Map<String, Integer> miTree = new TreeMap<>(miMapa);
        System.out.println("Ejemplo 6: " + miTree);
        
        int dato = miMapa.remove("Dos");
        System.out.println("dato = " + dato);
        
        //Tarea para ahora
        //De miMapa van a reemplazar el valor a la clave "Uno" con 10
        //Verificar si el mapa está vacio desde de eliminar todas las entradas
        
    
        
    }

}
