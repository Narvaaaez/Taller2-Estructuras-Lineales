package Recursividad;

import java.util.Scanner;

public class Ejercicio07 {

    // Maximo comun divisor por el algoritmo de Euclides
    static long mcd(long m, long n) {
        m = Math.abs(m);
        n = Math.abs(n);

        if (n == 0) {
            return m;
        }
        return mcd(n, m % n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese M: ");
        int m = sc.nextInt();

        System.out.print("Ingrese N: ");
        int n = sc.nextInt();

        System.out.println("M.C.D.: " + mcd(m, n));

        sc.close();
    }
}
