package Recursividad;

import java.util.Scanner;

public class Ejercicio08 {

    // Copia la cadena de origen en el arreglo destino, caracter por caracter
    static void copiarCadena(String origen, char[] destino, int indice) {
        if (indice == origen.length()) {
            return;
        }
        destino[indice] = origen.charAt(indice);
        copiarCadena(origen, destino, indice + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una cadena: ");
        String origen = sc.nextLine();

        char[] destino = new char[origen.length()];
        copiarCadena(origen, destino, 0);

        System.out.println("Cadena copiada: " + new String(destino));

        sc.close();
    }
}
