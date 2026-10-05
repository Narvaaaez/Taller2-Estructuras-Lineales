package Recursividad;

import java.util.Scanner;

public class Ejercicio04 {

    // Suma los digitos de un numero no negativo
    static int sumarDigitos(long n) {
        if (n < 10) {
            return (int) n;
        }
        return (int) (n % 10) + sumarDigitos(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int n = sc.nextInt();

        System.out.println("Suma de los digitos: " + sumarDigitos(Math.abs((long) n)));

        sc.close();
    }
}
