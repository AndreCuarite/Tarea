package ejercicios;

import java.util.Scanner;

public class ArregloCreciente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        llenarArreglo(sc, numeros);

        System.out.println("\nEl arreglo quedó así:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }

    public static void llenarArreglo(Scanner sc, int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            int num = 0;
            boolean valido;

            do {
                System.out.print("Ingrese el número " + (i + 1) + ": ");

                // primero verificamos que sea un número entero
                if (!sc.hasNextInt()) {
                    System.out.println("Eso no es un número entero válido, intenta de nuevo");
                    sc.next(); // descarta lo que escribió (letras, decimales, etc.)
                    valido = false;
                    continue;
                }

                num = sc.nextInt();

                if (i == 0) {
                    valido = true; // el primero no tiene con qué compararse
                } else if (num > arreglo[i - 1]) {
                    valido = true;
                } else {
                    valido = false;
                    System.out.println("Ese número debe ser mayor que " + arreglo[i - 1] + ", intenta de nuevo");
                }
            } while (!valido);

            arreglo[i] = num;
        }
    }
}
