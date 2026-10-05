package Recursividad;

import java.util.Scanner;

public class Ejercicio13 {

    // Valores ya calculados, para no repetir llamadas recursivas
    static long[] memo = new long[100];

    // Fib(0) = 0; Fib(1) = 1; Fib(n) = Fib(n-1) + Fib(n-2) si n >= 2
    static long fibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        memo[n] = fibonacci(n - 1) + fibonacci(n - 2);
        return memo[n];
    }

    // Imprime Fib(i), Fib(i+1), ... mientras el valor no supere el limite
    static void imprimirHastaLimite(int i, int limite) {
        long valor = fibonacci(i);

        if (valor > limite) {
            return;
        }
        System.out.print(valor + " ");
        imprimirHastaLimite(i + 1, limite);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el limite de la serie: ");
        int limite = sc.nextInt();

        if (limite < 0) {
            System.out.println("El limite debe ser mayor o igual a 0.");
            sc.close();
            return;
        }

        System.out.println("Serie de Fibonacci hasta " + limite + ":");
        imprimirHastaLimite(0, limite);
        System.out.println();

        sc.close();
    }
}
