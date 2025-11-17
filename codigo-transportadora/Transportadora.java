public class Transportadora {
    // Atributos
    private Encomenda[] encomendas;
    private int quantidade;

    // Construtor
    public Transportadora() {
        // Vetor para até 10 encomendas, como pedido
        this.encomendas = new Encomenda[10];
        // O número de encomendas cadastradas começa em 0
        this.quantidade = 0;
    }

    // Método para inserir uma nova encomenda no vetor
    public void adicionarEncomenda(Encomenda encomenda) {
        if (this.quantidade < 10) {
            this.encomendas[this.quantidade] = encomenda;
            this.quantidade++;
            System.out.println("Encomenda " + encomenda.getCodigo() + " adicionada com sucesso.");
        } else {
            System.out.println("Erro: Capacidade máxima de encomendas atingida.");
        }
    }

    // Método para exibir todas as encomendas cadastradas
    public void listarEncomendas() {
        System.out.println("\n=== Lista de Encomendas Cadastradas ===");
        if (this.quantidade == 0) {
            System.out.println("Nenhuma encomenda cadastrada.");
        } else {
            for (int i = 0; i < this.quantidade; i++) {
                this.encomendas[i].exibirInfo();
                System.out.println("------------------------------------");
            }
        }
    }

    // Método para buscar uma encomenda pelo código
    public Encomenda buscarPorCodigo(int codigo) {
        for (int i = 0; i < this.quantidade; i++) {
            if (this.encomendas[i].getCodigo() == codigo) {
                return this.encomendas[i]; // Retorna a encomenda se o código for encontrado
            }
        }
        return null; // Retorna null se não encontrar
    }
}
