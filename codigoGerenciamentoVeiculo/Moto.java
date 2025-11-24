public class Moto extends Veiculo {
    private int cilindradas;
    private String tipoPartida;
    private boolean possuiBau;

    public Moto(String marca, String modelo, int ano, double precoBase,
                int cilindradas, String tipoPartida, boolean possuiBau) {
        super(marca, modelo, ano, precoBase);
        this.cilindradas = cilindradas;
        this.tipoPartida = tipoPartida;
        this.possuiBau = possuiBau;
    }

    @Override
    public double calcularPrecoVenda() {
        double precoVenda = getPrecoBase();
        
        if (cilindradas > 300) {
            precoVenda += 2000;
        }
        if (possuiBau) {
            precoVenda += 800;
        }
        
        return precoVenda;
    }

    @Override
    public double calcularSeguro() {
        double seguro = getPrecoBase() * 0.02;
        
        if (cilindradas > 300) {
            seguro *= 1.8; // +80%
        }
        
        return seguro;
    }

    // Getters específicos
    public int getCilindradas() {
        return cilindradas;
    }

    public String getTipoPartida() {
        return tipoPartida;
    }

    public boolean isPossuiBau() {
        return possuiBau;
    }

    @Override
    public String toString() {
        return String.format("MOTO - %s, Cilindradas: %d, Partida: %s, Baú: %s, " +
                           "Preço Venda: R$ %.2f, Seguro: R$ %.2f",
                           super.toString(), cilindradas, tipoPartida, 
                           possuiBau ? "Sim" : "Não", calcularPrecoVenda(), calcularSeguro());
    }
}