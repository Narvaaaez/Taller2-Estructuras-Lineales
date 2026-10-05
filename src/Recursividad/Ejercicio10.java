package Recursividad;

import java.util.Scanner;

public class Ejercicio10 {

    // Multiplicacion mediante sumas sucesivas
    static long multiplicar(long a, long b) {
        // Se recorre el factor mas pequeno para recursar lo menos posible
        if (Math.abs(b) > Math.abs(a)) {
            return multiplicar(b, a);
        }
        if (b == 0) {
            return 0;
        }
        if (b < 0) {
            return -multiplicar(a, -b);
        }
        return a + multiplicar(a, b - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int a = sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int b = sc.nextInt();

        System.out.println("Multiplicacion: " + multiplicar(a, b));

        sc.close();
    }
}
