package Clase14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // String[] array = {"Java", "es", "genial", "y", "potente"};
        // List<String> listaPalabras = Arrays.asList(array);
        List<String> listaPalabras = Arrays.asList("Java", "es", "genial", "y", "potente");

        // Filtrar palabras con longitud mayor a 3 y convertirlas a mayúsculas
        List<String> palabrasFiltradas = listaPalabras.stream()
                .filter(palabra -> palabra.length() > 3)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        
        // Imprimimos las palabras filtradas y convertidas a mayúsculas
        // palabrasFiltradas.forEach(elemento -> System.out.println(elemento));
        palabrasFiltradas.forEach(System.out::println);

    }

}