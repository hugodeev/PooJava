public class Caminhao extends Veiculo {
    private double capacidadeCarga;
    private int numeroEixos;
    private String tipoCarroceria;

    public Caminhao(String marca, String modelo, int ano, double precoBase,
                    double capacidadeCarga, int numeroEixos, String tipoCarroceria) {
        super(marca, modelo, ano, precoBase);
        this.capacidadeCarga = capacidadeCarga;
        this.numeroEixos = numeroEixos;
        this.tipoCarroceria = tipoCarroceria;
    }

    @Override
    public double calcularPrecoVenda() {
        double precoVenda = getPrecoBase();
        precoVenda += capacidadeCarga * 1000;
        precoVenda += numeroEixos * 15000;
        
        return precoVenda;
    }

    @Override
    public double calcularSeguro() {
        double seguro = getPrecoBase() * 0.015;
        seguro += capacidadeCarga * 500;
        seguro += numeroEixos * 1000;
        
        return seguro;
    }

    // Getters específicos
    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public int getNumeroEixos() {
        return numeroEixos;
    }

    public String getTipoCarroceria() {
        return tipoCarroceria;
    }

    @Override
    public String toString() {
        return String.format("CAMINHÃO - %s, Carga: %.1f ton, Eixos: %d, Carroceria: %s, " +
                           "Preço Venda: R$ %.2f, Seguro: R$ %.2f",
                           super.toString(), capacidadeCarga, numeroEixos, tipoCarroceria,
                           calcularPrecoVenda(), calcularSeguro());
    }
}