public class Main {
    public static void main(String[] args) {
        int[] vetor = {1, 5, 2, 3, 1, 3, 1};

        int moda = 0;
        int freqMaior = 0;

        for (int i = 0; i < vetor.length; i++) {
            int freq = 0;

            for (int j = 0; j < vetor.length; j++) {
                if (vetor[i] == vetor[j])
                    freq++;
            }

            if (freq > freqMaior) {
                freqMaior = freq;
                moda = vetor[i];
            }
        }
        System.out.println("Moda: " + moda);
    }
}