public class Principal {
    public static void main(String[] args) {
        // Criar transportadora
        Transportadora transportadora = new Transportadora();

        // Adicionar pelo menos 5 encomendas
        transportadora.adicionarEncomenda(new Encomenda(101, "Maria Silva", "Rua A, 123", "Postado"));
        transportadora.adicionarEncomenda(new Encomenda(102, "João Souza", "Av. B, 456", "Em trânsito"));
        transportadora.adicionarEncomenda(new Encomenda(103, "Ana Lima", "Rua C, 789", "Postado"));
        transportadora.adicionarEncomenda(new Encomenda(104, "Carlos Mendes", "Av. D, 101", "Entregue"));
        transportadora.adicionarEncomenda(new Encomenda(105, "Juliana Rocha", "Rua E, 202", "Postado"));

        // Listar todas as encomendas
        System.out.println("Lista de Encomendas:");
        transportadora.listarEncomendas();

        // Buscar uma encomenda pelo código e exibir informações
        System.out.println("Buscando encomenda de código 103...");
        Encomenda encontrada = transportadora.buscarPorCodigo(103);
        if (encontrada != null) {
            encontrada.exibirInfo();

            // Atualizar status dessa encomenda
            encontrada.atualizarStatus("Em trânsito");
            System.out.println("Status atualizado!");
        } else {
            System.out.println("Encomenda não encontrada!");
        }

        // Listar todas as encomendas novamente
        System.out.println("\nLista de Encomendas Atualizada:");
        transportadora.listarEncomendas();
    }
}