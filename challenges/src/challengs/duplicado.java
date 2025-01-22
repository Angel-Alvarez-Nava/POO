package challengs;

import java.util.HashMap;
import java.util.Map;

public class duplicado {
    public static void main(String[] args) {
        // Palabra de prueba
        String palabra = "programacion";

        // Crear un mapa para contar las repeticiones de cada letra
        Map<Character, Integer> conteoLetras = new HashMap<>();

        // Recorrer cada letra en la palabra
        for (char letra : palabra.toCharArray()) {
            conteoLetras.put(letra, conteoLetras.getOrDefault(letra, 0) + 1);
        }

        // Mostrar letras duplicadas y sus repeticiones
        System.out.println("Letras duplicadas en la palabra \"" + palabra + "\":");
        for (Map.Entry<Character, Integer> entrada : conteoLetras.entrySet()) {
            if (entrada.getValue() > 1) {
                System.out.println("Letra '" + entrada.getKey() + "' se repite " + entrada.getValue() + " veces.");
            }
        }
    }
}