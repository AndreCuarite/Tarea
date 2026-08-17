package Tarea;

import java.util.Random;
public class Ejercicio3 {
    public static void main(String[] datos) {
        int[] caras = new int[6];
        Random azar = new Random();

        for (int i = 0; i < 20000; i++) {
            int tiro = azar.nextInt(6);
            caras[tiro]++;
        }

        for (int i = 0; i < 6; i++) {
            System.out.println("Cara " + (i + 1) + ": " + caras[i]);
        }
    }
}