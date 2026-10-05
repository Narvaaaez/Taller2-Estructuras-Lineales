package Recursividad;

import java.util.Scanner;

public class Ejercicio12 {

    // Suma todos los elementos de la matriz recorriendo fila por fila
    static int sumar(int[][] m, int f, int c) {
        if (f == m.length) {
            return 0;
        }
        if (c == m[f].length) {
            return sumar(m, f + 1, 0);
        }
        return m[f][c] + sumar(m, f, c + 1);
    }

    // Imprime la matriz con un salto de linea al terminar cada fila
    static void imprimir(int[][] m, int f, int c) {
        if (f == m.length) {
            return;
        }
        if (c == m[f].length) {
            System.out.println();
            imprimir(m, f + 1, 0);
            return;
        }
        System.out.print(m[f][c] + " ");
        imprimir(m, f, c + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero de filas (m): ");
        int m = sc.nextInt();

        System.out.print("Numero de columnas (n): ");
        int n = sc.nextInt();

        if (m <= 0 || n <= 0) {
            System.out.println("Las dimensiones deben ser mayores que 0.");
            sc.close();
            return;
        }

        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatriz:");
        imprimir(a, 0, 0);
        System.out.println("Suma de los elementos: " + sumar(a, 0, 0));

        sc.close();
    }
}
