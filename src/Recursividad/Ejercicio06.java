package Recursividad;

import java.util.Scanner;

public class Ejercicio06 {

    // Calcula base elevada al exponente (acepta exponentes negativos)
    static double potencia(double base, long exponente) {
        if (exponente == 0) {
            return 1;
        }
        if (exponente < 0) {
            return 1.0 / potencia(base, -exponente);
        }
        return base * potencia(base, exponente - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la base: ");
        double b = sc.nextDouble();

        System.out.print("Ingrese el exponente: ");
        int e = sc.nextInt();

        if (b == 0 && e < 0) {
            System.out.println("No se puede elevar 0 a un exponente negativo.");
        } else {
            System.out.println("Resultado: " + potencia(b, e));
        }

        sc.close();
    }
}
