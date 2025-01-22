package challengs;

import java.util.Arrays;

public class dado {
    public static void main(String[] args) {
        // Arreglo original ordenado
        int[] arregloOriginal = {-6, -3, -1, 2, 4, 5};

        // Llamamos al método que calcula los cuadrados
        int[] cuadradosOrdenados = obtenerCuadradosOrdenados(arregloOriginal);

        // Imprimir el resultado
        System.out.println("Arreglo original: " + Arrays.toString(arregloOriginal));
        System.out.println("Arreglo con cuadrados ordenados: " + Arrays.toString(cuadradosOrdenados));
    }

    public static int[] obtenerCuadradosOrdenados(int[] arreglo) {
        int n = arreglo.length;
        int[] resultado = new int[n];

        // Uso de dos punteros
        int izquierda = 0;
        int derecha = n - 1;
        int posicion = n - 1;

        while (izquierda <= derecha) {
            int cuadradoIzquierda = arreglo[izquierda] * arreglo[izquierda];
            int cuadradoDerecha = arreglo[derecha] * arreglo[derecha];

            // Ordenamos los cuadrados en el resultado
            if (cuadradoIzquierda > cuadradoDerecha) {
                resultado[posicion] = cuadradoIzquierda;
                izquierda++;
            } else {
                resultado[posicion] = cuadradoDerecha;
                derecha--;
            }
            posicion--;
        }

        return resultado;
    }
}