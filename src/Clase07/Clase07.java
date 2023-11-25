package Clase07;

// import java.util.ArrayList;

import java.util.HashMap;
import java.util.Map;

// import java.util.List;
// import java.util.HashSet;
// import java.util.Set;

public class Clase07 {
    public static void main(String[] args) {
        /*
         * //Colecciones o Collections: son un conjunto de clases e interfaces que
         * proporcionan estructuras de datos para almacenar, organizar y
         * manipular datos de manera eficiente
         * 
         * Hay diferentes tipos de clases de collecciones:
         * 
         * 1- List: Una lista ordenada que permite elementos duplicados
         * Las implementaciones más comunes: ArrayList y LinkedList
         * 
         * 2- Set: Un conjunto es una colección que no permite elementos
         * duplicados.
         * Las implementaciones son: HashSet, LinkedHashSet, y TreeSet
         * 
         * 3- Map: Un mapa es una colección de pares clave-valor
         * Las implementaciones del map: HashMap, LinkedHashMap y TreeMap
         */

        // _______________________________________________________

        // List: La clase que usamos
        // <String> Declaramos el tipo de dato que usaremos en la lista
        // miLista: asignamos el nombre de la lista
        // new: Palabra reservada que nos indica el tipo de implementación
        // ArrayList: la implementación

        /*
         * //Cremos una lista
         * List<String> miLista = new ArrayList<>();
         * 
         * // Agregamos elementos a la lista con el método add
         * miLista.add("Manzana");
         * miLista.add("Mandarina");
         * miLista.add("Frutilla");
         * 
         * // Accedemos a elementos por indice cero
         * String primeraFruta = miLista.get(0);
         * String segundaFruta = miLista.get(1);
         * System.out.println("la primera Fruta es: " + primeraFruta);
         * System.out.println("la segunda Fruta es: " + segundaFruta);
         * 
         * //Iteramos a través de la lista
         * for ( String fruta : miLista ){
         * System.out.println("Fruta: " + fruta);
         * }
         */

        /*
         * //Set
         * //Creamos un conjuntos
         * Set<String> miSet = new HashSet<>();
         * 
         * 
         * //Agregamos elementos al conjunto
         * miSet.add("Zapallo");
         * miSet.add("Zanahoria");
         * miSet.add("Limón");
         * 
         * for( String verduras : miSet ){
         * System.out.println("Verduras: " + verduras);
         * }
         */

        // Map:
        // Crear un mapa:

        Map<String, Integer> miMapa = new HashMap<>();

        // Agregar pares clave-valor al mapa

        miMapa.put("Zapatos", 25);
        miMapa.put("Camisas", 15);
        miMapa.put("Remeras", 32);

        // Accedemos a un valor por clase
        int cantidadZapatos = miMapa.get("Zapatos");
        System.out.println("Cantidad de zapatos: " + cantidadZapatos);

        // Interar a través de claves y valores del mapa
        // key
        for (String productos : miMapa.keySet()) {
            int cantidad = miMapa.get(productos);
            System.out.println("Productos: " + productos + ", cantidad: " + cantidad);
        }

    }

}
