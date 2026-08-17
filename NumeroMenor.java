package ejercicios;

import java.util.Scanner;

public class NumeroMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = pedirDecimal(sc, "Ingrese el primer número: ");
        double n2 = pedirDecimal(sc, "Ingrese el segundo número: ");
        double n3 = pedirDecimal(sc, "Ingrese el tercer número: ");

        System.out.println("El menor es: " + menor(n1, n2, n3));
    }

    public static double pedirDecimal(Scanner sc, String mensaje) {
        double valor = 0;
        boolean valido = false;

        do {
            System.out.print(mensaje);
            if (!sc.hasNextDouble()) {
                System.out.println("Debes ingresar un número decimal válido (ej: 3.5), intenta de nuevo");
                sc.next(); // descarta lo inválido
            } else {
                valor = sc.nextDouble();
                valido = true;
            }
        } while (!valido);

        return valor;
    }

    public static double menor(double a, double b, double c) {
        double resultado;

        if (a <= b && a <= c) {
            resultado = a;
        } else if (b <= a && b <= c) {
            resultado = b;
        } else {
            resultado = c;
        }

        return resultado;
    }
}