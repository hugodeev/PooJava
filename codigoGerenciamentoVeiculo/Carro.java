public class Carro extends Veiculo {
    private int numeroPortas;
    private String tipoCombustivel;
    private double potenciaMotor;

    public Carro(String marca, String modelo, int ano, double precoBase,
                 int numeroPortas, String tipoCombustivel, double potenciaMotor) {
        super(marca, modelo, ano, precoBase);
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
        this.potenciaMotor = potenciaMotor;
    }

    @Override
    public double calcularPrecoVenda() {
        double precoVenda = getPrecoBase();
        
        if (potenciaMotor > 2.0) {
            precoVenda += 5000;
        }
        if (numeroPortas > 4) {
            precoVenda += 3000;
        }
        
        return precoVenda;
    }

    @Override
    public double calcularSeguro() {
        double seguro = getPrecoBase() * 0.03;
        
        if (potenciaMotor > 2.0) {
            seguro *= 1.5; // +50%
        }
        
        return seguro;
    }

    // Getters específicos
    public int getNumeroPortas() {
        return numeroPortas;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public double getPotenciaMotor() {
        return potenciaMotor;
    }

    @Override
    public String toString() {
        return String.format("CARRO - %s, Portas: %d, Combustível: %s, Potência: %.1f, " +
                           "Preço Venda: R$ %.2f, Seguro: R$ %.2f",
                           super.toString(), numeroPortas, tipoCombustivel, potenciaMotor,
                           calcularPrecoVenda(), calcularSeguro());
    }
}