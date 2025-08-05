public class Televisor {
    private int canal;
    private int volume;
    private boolean ligado;

    // Construtor
    public Televisor(int canalInicial, int volumeInicial) {
        this.canal = canalInicial;
        this.volume = volumeInicial;
        this.ligado = false; 
    }

    // Métodos para ligar e desligar
    public void ligar() {
        this.ligado = true;
        System.out.println("Televisor ligado.");
    }

    public void desligar() {
        this.ligado = false;
        System.out.println("Televisor desligado.");
    }

    // Métodos para aumentar e diminuir o volume
    public void aumentarVolume(int aumento) {
        if (ligado) {
            if (volume + aumento <= 100) {
                volume += aumento;
                System.out.println("Volume aumentado para: " + volume);
            } else {
                System.out.println("Volume já está no máximo.");
            }
        } else {
            System.out.println("Não é possível alterar o volume. O Televisor está desligado.");
        }
    }

    public void diminuirVolume(int diminuir) {
        if (ligado) {
            if (volume - diminuir >= 0) {
                volume -= diminuir;
                System.out.println("Volume diminuído para: " + volume);
            } else {
                System.out.println("Volume já está no mínimo.");
            }
        } else {
            System.out.println("Não é possível alterar o volume. O Televisor está desligado.");
        }
    }

    // Método para trocar o canal
    public void trocarCanal(int novoCanal) {
        if (ligado) {
            this.canal = novoCanal;
            System.out.println("Canal trocado para: " + canal);
        } else {
            System.out.println("Não é possível trocar o canal. O Televisor está desligado.");
        }
    }

    // Método toString para representação textual
    public String toString() {
        return "Televisor [Canal: " + canal + ", Volume: " + volume + ", Ligado: " + (ligado ? "Sim" : "Não") + "]";
    }
}