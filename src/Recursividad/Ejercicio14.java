package Recursividad;

import java.util.Scanner;

public class Ejercicio14 {

    // Funcion de Ackermann
    static long ackermann(long m, long n) {
        if (m == 0) {
            return n + 1;
        }
        if (n == 0) {
            return ackermann(m - 1, 1);
        }
        return ackermann(m - 1, ackermann(m, n - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese m (recomendado pequeno): ");
        int m = sc.nextInt();

        System.out.print("Ingrese n (recomendado pequeno): ");
        int n = sc.nextInt();

        if (m < 0 || n < 0) {
            System.out.println("m y n deben ser mayores o iguales a 0.");
        } else {
            try {
                System.out.println("Ackermann(" + m + ", " + n + ") = " + ackermann(m, n));
            } catch (StackOverflowError e) {
                System.out.println("Los valores son demasiado grandes: la recursion se desbordo.");
            }
        }

        sc.close();
    }
}
