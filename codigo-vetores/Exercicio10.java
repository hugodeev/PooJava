import java.util.Arrays;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];

        System.out.println("Digite 10 números inteiros para o vetor A:");
        for (int i = 0; i < A.length; i++) {
            A[i] = teclado.nextInt();
            B[i] = A[i] % 2;
        }

        System.out.println("Vetor B (A % 2): " + Arrays.toString(B));

        teclado.close();
    }
}
