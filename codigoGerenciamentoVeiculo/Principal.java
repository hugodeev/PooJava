public class Principal {
    public static void main(String[] args) {
        // Criar a concessionária
        Concessionaria concessionaria = new Concessionaria();

        // Adicionar alguns veículos
        System.out.println("=== ADICIONANDO VEÍCULOS ===");
        
        // Carros
        Carro carro1 = new Carro("Toyota", "Corolla", 2023, 120000, 4, "Flex", 2.0);
        Carro carro2 = new Carro("Honda", "Civic", 2024, 130000, 4, "Gasolina", 1.8);
        Carro carro3 = new Carro("BMW", "X5", 2023, 350000, 5, "Gasolina", 3.0);

        // Motos
        Moto moto1 = new Moto("Honda", "CB 500", 2023, 35000, 500, "Elétrica", true);
        Moto moto2 = new Moto("Yamaha", "MT-03", 2024, 28000, 321, "Elétrica", false);

        // Caminhões
        Caminhao caminhao1 = new Caminhao("Volvo", "FH 540", 2023, 450000, 25.0, 6, "Baú");
        Caminhao caminhao2 = new Caminhao("Mercedes", "Actros", 2024, 480000, 30.0, 7, "Cegonheira");

        // Adicionar à concessionária
        concessionaria.adicionarVeiculo(carro1);
        concessionaria.adicionarVeiculo(carro2);
        concessionaria.adicionarVeiculo(carro3);
        concessionaria.adicionarVeiculo(moto1);
        concessionaria.adicionarVeiculo(moto2);
        concessionaria.adicionarVeiculo(caminhao1);
        concessionaria.adicionarVeiculo(caminhao2);

        System.out.println("\n" + "=".repeat(50));

        // Listar veículos cadastrados
        concessionaria.listarVeiculos();

        System.out.println("\n" + "=".repeat(50));

        // Mostrar valor total do estoque
        double valorTotalEstoque = concessionaria.calcularValorTotalEstoque();
        System.out.printf("VALOR TOTAL DO ESTOQUE: R$ %.2f%n", valorTotalEstoque);

        System.out.println("\n" + "=".repeat(50));

        // Buscar veículo por marca
        concessionaria.buscarPorMarca("Honda");
        concessionaria.buscarPorMarca("Ferrari"); // Marca não existente

        System.out.println("\n" + "=".repeat(50));

        // Exibir veículo mais caro
        Veiculo maisCaro = concessionaria.veiculoMaisCaro();
        if (maisCaro != null) {
            System.out.println("VEÍCULO MAIS CARO:");
            System.out.println(maisCaro);
            System.out.printf("Preço de Venda: R$ %.2f%n", maisCaro.calcularPrecoVenda());
        }

        System.out.println("\n" + "=".repeat(50));

        // Exibir total anual de seguro
        double seguroTotal = concessionaria.calcularSeguroTotal();
        System.out.printf("TOTAL ANUAL DE SEGURO: R$ %.2f%n", seguroTotal);

        System.out.println("\n" + "=".repeat(50));

        // Estatísticas adicionais
        System.out.println("ESTATÍSTICAS DA CONCESSIONÁRIA:");
        System.out.println("Total de veículos: " + concessionaria.getQuantidadeVeiculos());
        System.out.printf("Valor médio por veículo: R$ %.2f%n", 
                         valorTotalEstoque / concessionaria.getQuantidadeVeiculos());
    }
}