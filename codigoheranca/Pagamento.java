
public abstract class Pagamento {

    protected String nomeCliente;
    protected double valor;

    public Pagamento(String nomeCliente, double valor) {
        this.nomeCliente = nomeCliente;
        this.valor = valor;
    }

    public abstract double processarPagamento();

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getValor() {
        return valor;
    }
}
