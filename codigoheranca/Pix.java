
public class Pix extends Pagamento {

    private String chave;

    public Pix(String nomeCliente, double valor, String chave) {
        super(nomeCliente, valor);
        this.chave = chave;
    }

    @Override
    public double processarPagamento() {
        return valor;  // sem taxas
    }

    @Override
    public String toString() {
        return "PIX - Cliente: \n" + nomeCliente +
               ", Valor: R$ " + processarPagamento() +
               ", Chave: " + chave;
    }
}
