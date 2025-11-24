
public class CartaoCredito extends Pagamento {

    private int quantidadeParcelas;

    public CartaoCredito(String nomeCliente, double valor, int quantidadeParcelas){
        super(nomeCliente, valor);
        this.quantidadeParcelas = quantidadeParcelas;
    }

    @Override
    public double processarPagamento() {
        return valor + (valor * quantidadeParcelas * 0.02);
    }

    @Override
    public String toString() {
        return "Cartão de Crédito - Cliente: \n" + 
               "Nome Cliente: " + nomeCliente +
               ", Valor total com juros: R$ " + processarPagamento() +
               ", Parcelas: " + quantidadeParcelas;
    }
}
