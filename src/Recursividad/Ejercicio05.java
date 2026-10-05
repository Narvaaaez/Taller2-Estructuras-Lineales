package Recursividad;

import java.util.Scanner;

public class Ejercicio05 {

    // Suma de los numeros desde 1 hasta n
    static long sumatoria(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sumatoria(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int n = sc.nextInt();

        System.out.println("Sumatoria hasta " + n + ": " + sumatoria(n));

        sc.close();
    }
}
