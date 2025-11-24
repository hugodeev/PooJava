

public class CadastroPagamento {

    Pagamento[] pagamentos = new Pagamento[10]; // vetor fixo
    int qtd = 0; // contador

    public void adicionar(Pagamento p) {
        pagamentos[qtd] = p;
        qtd++;
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < qtd; i++) {
            total += pagamentos[i].processarPagamento();
        }
        return total;
    }

    public void imprimirPagamentos() {
        for (int i = 0; i < qtd; i++) {
            System.out.println(pagamentos[i]);
        }
    }
    
}
