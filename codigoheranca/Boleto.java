
public class Boleto extends Pagamento {

    private String linhaDigitavel;

    public Boleto(String nomeCliente, double valor, String linhaDigitavel) {
        super(nomeCliente, valor);
        this.linhaDigitavel = linhaDigitavel;
    }

    @Override
    public double processarPagamento() {
        return valor + (valor * 0.015); // 1,5%
    }

    @Override
    public String toString() {
        return "Boleto - Cliente: \n" + nomeCliente +
               ", Valor com taxa: R$ " + processarPagamento() +
               ", Linha Digitável: " + linhaDigitavel;
    }
}
