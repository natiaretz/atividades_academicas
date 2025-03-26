/*
Programa para converter metros em centímetros.
*/

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em metros: ");
        int metros = scanner.nextInt(); // Lê um número inteiro

        int centimetros = metros * 100; // Converte metros para centímetros

        System.out.println(metros + " metros equivalem a " + centimetros + " centímetros."); // Exibe o resultado

        scanner.close(); // Fecha o Scanner
    }
}
