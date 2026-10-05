package Recursividad;

import java.util.Scanner;

public class Ejercicio01 {

    // Factorial de n (n! = n * (n-1)!)
    static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("El factorial no esta definido para numeros negativos.");
        } else if (n > 20) {
            System.out.println("El numero es demasiado grande (maximo 20 para no desbordar).");
        } else {
            System.out.println("Factorial de " + n + ": " + factorial(n));
        }

        sc.close();
    }
}
