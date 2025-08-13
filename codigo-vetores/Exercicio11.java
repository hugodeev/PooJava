import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] A = new int[10];
        int pares = 0;

        System.out.println("Digite 10 números inteiros para o vetor A:");
        for (int i = 0; i < A.length; i++) {
            A[i] = teclado.nextInt();
            if (A[i] % 2 == 0) {
                pares++;
            }
        }

        System.out.println("Quantidade de números pares: " + pares);

        teclado.close();
    }
}

