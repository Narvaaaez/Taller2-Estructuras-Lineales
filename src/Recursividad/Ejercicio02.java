package Recursividad;

import java.util.Scanner;

public class Ejercicio02 {

    // Invierte los digitos de n acumulando el resultado
    static long invertir(long n, long resultado) {
        if (n == 0) {
            return resultado;
        }
        return invertir(n / 10, resultado * 10 + n % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int n = sc.nextInt();

        int signo = (n < 0) ? -1 : 1;
        long invertido = signo * invertir(Math.abs((long) n), 0);

        System.out.println("Numero invertido: " + invertido);

        sc.close();
    }
}