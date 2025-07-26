package codigoconta;

public class PrincipalConta {
    public static void main(String[] args) {
        Conta c1 = new Conta(1, "Hugo");
        Conta c2 = new Conta(2, "Davi");
        Conta c3 = new Conta(3, "Jenni");

        System.out.println("=== Estado Inicial ===");
        c1.exibir();
        c2.exibir();
        c3.exibir();

        // Depósitos
        c1.depositar(500);
        c2.depositar(1000);
        c3.depositar(750);

        System.out.println("=== Após Depósitos ===");
        c1.exibir();
        c2.exibir();
        c3.exibir();

        // Alterar nome
        c1.setNome("Hugo");
        c2.setNome("Davi");
        c3.setNome("Jenni");

        // Saques
        c1.sacar(200);
        c2.sacar(1200);
        c3.sacar(500);

        System.out.println("=== Após Saques ===");
        c1.exibir();
        c2.exibir();
        c3.exibir();

        // Desativar contas
        c1.desativar();
        c2.desativar();

        System.out.println("=== Após Desativação ===");
        c1.exibir();
        c2.exibir();
        c3.exibir();
    }
}