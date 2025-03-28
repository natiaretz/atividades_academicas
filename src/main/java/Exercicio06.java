/*
Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
*/

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");

        // Lê o valor do raio e armazena na variável 'raio'
        double raio = scanner.nextDouble(); // Usando 'nextDouble()' para ler o valor do raio

        // A constante PI é obtida através de Math.PI
        double pi = Math.PI;

        // Calcula a área do círculo usando a fórmula: Área = pi * raio²
        // Math.pow(raio, 2) calcula o quadrado do raio
        double circulo = pi * Math.pow(raio, 2);

        // %.2f é usado para formatar o valor como um número de ponto flutuante com 2 casas decimais
        System.out.printf("A área de um círculo de raio %.2f é %.2fm²", raio, circulo);

        scanner.close();
    }
}
