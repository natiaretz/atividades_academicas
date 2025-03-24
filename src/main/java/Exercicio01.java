/*
Faça um Programa que peça um número e então mostre a mensagem
O número informado foi [número].
*/

import java.util.Scanner;

public class Exercicio01 { // Declaração da classe principal (o nome do arquivo deve ser o mesmo da classe)
    public static void main(String[] args) { // Método principal, ponto de entrada do programa

        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para capturar a entrada do usuário

        System.out.print("Digite um número: "); // Exibe a mensagem pedindo um número (usei print para manter na mesma linha)
        int num = scanner.nextInt(); // Lê um número inteiro digitado pelo usuário e armazena na variável 'num'

        System.out.println("O número digitado foi: " + num); // Exibe o número digitado pelo usuário

        // Fecha o Scanner para liberar recursos
        scanner.close();
    }
}
