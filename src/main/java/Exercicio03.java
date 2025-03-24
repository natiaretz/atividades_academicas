/*
Faça um Programa que peça as 4 notas bimestrais e mostre a média.
*/

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Boas-vindas ao Sistema para somar sua média!");

        // Solicita as notas do estudante
        System.out.print("Digite a 1ª nota: ");
        double nota1 = scanner.nextDouble(); // Armazena as notas como um número decimal (double)

        System.out.print("Digite a 2ª nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a 3ª nota: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a 4ª nota: ");
        double nota4 = scanner.nextDouble();

        // Calcula a média das quatro notas
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Exibe a média calculada com 2 casas decimais
        System.out.printf("Sua média é: %.2f\n", media);

        // Fecha o scanner para liberar o recurso após o uso
        scanner.close();
    }
}
