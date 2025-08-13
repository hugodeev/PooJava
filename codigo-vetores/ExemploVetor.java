import java.util.Scanner;


public class ExemploVetor {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Pessoa[] pessoas = new Pessoa[3];

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Digite o nome:");
            String nome = teclado.nextLine();

            System.out.println("Digite a idade:");
            int idade = teclado.nextInt();
            teclado.nextLine(); 

            pessoas[i] = new Pessoa(nome, idade);
        }

        teclado.close();

        System.out.println("\n--- Lista de Pessoas ---");
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }
    }
}

