package Tarea;

public class Ejercicios1 {
    public static int sumar(int[] lista) {
        int suma = 0;
        for (int numero : lista) {
            suma = suma + numero;
        }
        return suma;
    }

    public static void main(String[] texto) {
        int[] Numeros = {5, 10, 15};
        System.out.println("La suma total es: " + sumar(Numeros));
    }
}