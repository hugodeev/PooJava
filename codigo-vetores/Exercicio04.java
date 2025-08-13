
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] A = new int[15];
        double[] B = new double[15];

        System.out.println("Digite 15 números inteiros para o vetor A:");
        for (int i = 0; i < A.length; i++) {
            A[i] = teclado.nextInt();
            B[i] = Math.sqrt(A[i]);
        }

        System.out.println("Vetor B (raiz quadrada): " + Arrays.toString(B));

        teclado.close();
    }
}
