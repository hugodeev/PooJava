package codigoconta;

    public class Conta {

    // Atributos
    private double numConta;
    private String nome;
    private double saldo;
    private boolean ativa;

    // Construtor
    public Conta(double numConta, String nome) {
        this.numConta = numConta;
        this.nome = nome;
        this.saldo = 0;
        this.ativa = true;
    }

    // Métodos principais
    public void depositar(double valor) {
        if (valor > 0 && ativa) {
            saldo += valor;
            System.out.println("Depósito realizado. Saldo atual: R$" + saldo);
        } else {
            System.out.println("O valor não pode ser depositado!");
        }
    }

    public void sacar(double valor) {
        if (valor <= saldo && ativa) {
            saldo -= valor;
            System.out.println("Saque realizado. Saldo atual: R$" + saldo);
        } else {
            System.out.println("O valor não pode ser retirado!");
        }
    }

    public void desativar() {
        if (ativa) {
            ativa = false;
            System.out.println("Conta " + numConta + " desativada.");
        }
    }

    public void ativar() {
        if (!ativa) {
            ativa = true;
            System.out.println("Conta " + numConta + " ativada.");
        }
    }

    public void exibir() {
        System.out.println(toString());
    }

    public String toString() {
        return "Conta Nº: " + numConta +
               "\nCliente: " + nome +
               "\nSaldo: R$" + String.format("%.2f", saldo) +
               "\nStatus: " + (ativa ? "Ativada" : "Desativada") +
               "\n---------------------------";
    }

    // Getters e Setters
    public double getNumConta() {
        return numConta;
    }

    public void setNumConta(double numConta) {
        this.numConta = numConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
}