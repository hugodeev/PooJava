import java.util.Arrays;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int[5];

        System.out.println("Digite 5 números inteiros para o vetor A:");
        for (int i = 0; i < A.length; i++) {
            A[i] = teclado.nextInt();
            B[i] = A[i];
        }

        System.out.println("Vetor A: " + Arrays.toString(A));
        System.out.println("Vetor B (cópia): " + Arrays.toString(B));

        teclado.close();
    }
}
