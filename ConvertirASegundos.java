package ejercicios;

import java.util.Scanner;

public class ConvertirASegundos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horas = pedirEnteroValido(sc, "Ingrese horas: ");
        int minutos = pedirEnteroValido(sc, "Ingrese minutos: ");
        int segundos = pedirEnteroValido(sc, "Ingrese segundos: ");

        int total = convertirASegundos(horas, minutos, segundos);
        System.out.println("Equivalente en segundos: " + total);
    }

    // pide un número entero, rechaza decimales/texto y valores negativos
    public static int pedirEnteroValido(Scanner sc, String mensaje) {
        int valor = 0;
        boolean valido = false;

        do {
            System.out.print(mensaje);

            if (!sc.hasNextInt()) {
                System.out.println("Debes ingresar un número entero (sin decimales), intenta de nuevo");
                sc.next(); // descarta lo que escribió (decimal, texto, etc.)
                continue;
            }

            valor = sc.nextInt();

            if (valor < 0) {
                System.out.println("No se aceptan negativos, intenta de nuevo");
            } else {
                valido = true;
            }
        } while (!valido);

        return valor;
    }

    public static int convertirASegundos(int horas, int minutos, int segundos) {
        return (horas * 3600) + (minutos * 60) + segundos;
    }
}