import java.util.Arrays;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];

        System.out.println("Digite 10 números inteiros para o vetor A:");
        for (int i = 0; i < A.length; i++) {
            A[i] = teclado.nextInt();
        }

        System.out.println("Digite 10 números inteiros para o vetor B:");
        for (int i = 0; i < B.length; i++) {
            B[i] = teclado.nextInt();
            C[i] = A[i] + B[i];
        }

        System.out.println("Vetor C (A + B): " + Arrays.toString(C));

        teclado.close();
    }
}
