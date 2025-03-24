/*
Faça um Programa que peça dois números e imprima a soma.
*/

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = scanner.nextInt(); // Captura o primeiro número inserido pelo usuário e o armazena em 'num1'.

        System.out.print("Digite outro número: ");
        int num2 = scanner.nextInt(); // Captura o segundo número inserido pelo usuário e o armazena em 'num2'.

        // Exibe a soma dos dois números. O operador '+' concatena o texto "A soma é: " com o resultado da soma.
        System.out.println("A soma é: " + (num1 + num2));

        scanner.close(); // Fecha o scanner para liberar os recursos do sistema.
    }
}