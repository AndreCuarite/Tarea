package Tarea;

import java.util.Scanner;
public class Ejercicio5 {
    public static void cobrar(int horas) {
        if (horas <= 0) {
            System.out.println("Total: S/ 0");
            return;
        }

        double total = 3.0;
        if (horas > 1) {
            int extra = horas - 1;
            total = total + (extra * 0.5);
        }

        if (total > 12.0) {
            total = 12.0;
        }

        System.out.println("Total: S/ " + total);
    }

    public static void main(String[] datos) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Horas: ");
        int horas = lector.nextInt();
        cobrar(horas);
    }
}