public class Concessionaria {
    private Veiculo[] veiculos;
    private int quantidadeVeiculos;

    public Concessionaria() {
        this.veiculos = new Veiculo[10];
        this.quantidadeVeiculos = 0;
    }

    public void adicionarVeiculo(Veiculo v) {
        if (quantidadeVeiculos < veiculos.length) {
            veiculos[quantidadeVeiculos] = v;
            quantidadeVeiculos++;
            System.out.println("Veículo adicionado com sucesso!");
        } else {
            System.out.println("Capacidade máxima atingida! Não é possível adicionar mais veículos.");
        }
    }

    public void listarVeiculos() {
        if (quantidadeVeiculos == 0) {
            System.out.println("Nenhum veículo cadastrado na concessionária.");
            return;
        }

        System.out.println("\n=== VEÍCULOS CADASTRADOS ===");
        for (int i = 0; i < quantidadeVeiculos; i++) {
            System.out.println((i + 1) + ". " + veiculos[i]);
        }
    }

    public double calcularValorTotalEstoque() {
        double total = 0;
        for (int i = 0; i < quantidadeVeiculos; i++) {
            total += veiculos[i].calcularPrecoVenda();
        }
        return total;
    }

    public void buscarPorMarca(String marca) {
        boolean encontrou = false;
        System.out.println("\n=== BUSCA POR MARCA: " + marca.toUpperCase() + " ===");
        
        for (int i = 0; i < quantidadeVeiculos; i++) {
            if (veiculos[i].getMarca().equalsIgnoreCase(marca)) {
                System.out.println(veiculos[i]);
                encontrou = true;
            }
        }
        
        if (!encontrou) {
            System.out.println("Nenhum veículo da marca '" + marca + "' encontrado.");
        }
    }

    public Veiculo veiculoMaisCaro() {
        if (quantidadeVeiculos == 0) {
            return null;
        }

        Veiculo maisCaro = veiculos[0];
        for (int i = 1; i < quantidadeVeiculos; i++) {
            if (veiculos[i].calcularPrecoVenda() > maisCaro.calcularPrecoVenda()) {
                maisCaro = veiculos[i];
            }
        }
        return maisCaro;
    }

    public double calcularSeguroTotal() {
        double total = 0;
        for (int i = 0; i < quantidadeVeiculos; i++) {
            total += veiculos[i].calcularSeguro();
        }
        return total;
    }

    public int getQuantidadeVeiculos() {
        return quantidadeVeiculos;
    }
}