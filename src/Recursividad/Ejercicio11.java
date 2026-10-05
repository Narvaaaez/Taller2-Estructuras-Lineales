package Recursividad;

import java.util.Scanner;

public class Ejercicio11 {

    // Suma los elementos del vector desde la posicion i
    static int sumar(int[] a, int i) {
        if (i == a.length) {
            return 0;
        }
        return a[i] + sumar(a, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantos valores desea ingresar: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("La cantidad no puede ser negativa.");
            sc.close();
            return;
        }

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        System.out.println("Suma del vector: " + sumar(a, 0));

        sc.close();
    }
}
