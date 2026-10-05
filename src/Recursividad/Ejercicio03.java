package Recursividad;

import java.util.Scanner;

public class Ejercicio03 {

    // Suma de la serie 1/1 + 1/2 + ... + 1/n
    static double sumatoria(int n) {
        if (n <= 0) {
            return 0.0;
        }
        return 1.0 / n + sumatoria(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un valor entero positivo: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("El valor debe ser mayor que 0.");
        } else {
            System.out.println("Resultado: " + sumatoria(n));
        }

        sc.close();
    }
}
