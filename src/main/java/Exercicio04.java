/*
Faça um Programa que mostre o valor da moda.
*/

public class Exercicio04 {
    public static void main(String[] args) {
        // Criação de um vetor de números para analisar
        int[] vetor = {1, 5, 2, 3, 1, 3, 1};

        // Variáveis para armazenar o valor da moda e sua frequência
        int moda = 0;
        int freqMaior = 0;

        // Laço para percorrer cada elemento do vetor
        for (int i = 0; i < vetor.length; i++) {
            int freq = 0; // Inicializa a variável de frequência para o valor atual

            // Laço aninhado para comparar o elemento atual com todos os outros
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[i] == vetor[j]) // Se o elemento for igual, incrementa a frequência
                    freq++;
            }

            // Verifica se a frequência do elemento atual é maior que a frequência maior encontrada
            if (freq > freqMaior) {
                freqMaior = freq; // Atualiza a maior frequência
                moda = vetor[i];  // Atualiza a moda
            }
        }

        // Exibe o valor da moda
        System.out.println("Moda: " + moda);
    }
}
