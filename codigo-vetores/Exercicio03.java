import java.util.Arrays;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] A = new int[15];
        int[] B = new int[15];

        System.out.println("Digite 15 números inteiros para o vetor A:");
        for (int i = 0; i < A.length; i++) {
            A[i] = teclado.nextInt();
            B[i] = A[i] * A[i];
        }

        System.out.println("Vetor B (quadrados): " + Arrays.toString(B));

        teclado.close();
    }
}
