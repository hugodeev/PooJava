public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double precoBase;

    public Veiculo(String marca, String modelo, int ano, double precoBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.precoBase = precoBase;
    }

    // Métodos abstratos
    public abstract double calcularPrecoVenda();
    public abstract double calcularSeguro();

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    @Override
    public String toString() {
        return String.format("Marca: %s, Modelo: %s, Ano: %d, Preço Base: R$ %.2f", 
                           marca, modelo, ano, precoBase);
    }
}