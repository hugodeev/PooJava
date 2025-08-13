import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] A = new int[10];
        int impares = 0;

        System.out.println("Digite 10 números inteiros para o vetor A:");
        for (int i = 0; i < A.length; i++) {
            A[i] = teclado.nextInt();
            if (A[i] % 2 == 1) {
                impares++;
            }
        }

        System.out.println("Quantidade de números Impares: " + impares);

        teclado.close();
    }
}

