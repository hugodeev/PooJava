public class ControleRemoto {
    
    private Televisor televisor;

    // Construtor
    public ControleRemoto(Televisor televisor) {
        this.televisor = televisor;
    }

    // Métodos para controlar o Televisor
    public void ligar() {
        televisor.ligar();
    }

    public void desligar() {
        televisor.desligar();
    }

    public void aumentarVolume(int aumento) {
        televisor.aumentarVolume(aumento);
    }

    public void diminuirVolume(int diminuir) {
        televisor.diminuirVolume(diminuir);
    }

    public void trocarCanal(int novoCanal) {
        televisor.trocarCanal(novoCanal);
    }

    // Exibir estado do Televisor
    public void exibirStatus() {
        System.out.println(televisor.toString());
    }
}