package Recursividad;

import java.util.Scanner;

public class Ejercicio09 {

    // Cociente entero mediante restas sucesivas
    static int cociente(int dividendo, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("No se puede dividir entre cero.");
        }
        if (dividendo < divisor) {
            return 0;
        }
        return 1 + cociente(dividendo - divisor, divisor);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el dividendo (positivo): ");
        int a = sc.nextInt();

        System.out.print("Ingrese el divisor (positivo): ");
        int b = sc.nextInt();

        if (a < 0 || b <= 0) {
            System.out.println("Use un dividendo positivo y un divisor mayor que 0.");
        } else {
            System.out.println("Cociente entero: " + cociente(a, b));
        }

        sc.close();
    }
}
