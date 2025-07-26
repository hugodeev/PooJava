public class Televisor {
    private int canal;
    private int volume;
    private boolean ligado;

    public Televisor(int canal, int volume) {
        this.canal = canal;
        this.volume = volume;
        this.ligado = false;
    }

    // Métodos
    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O televisor foi ligado com sucesso.");
        } else {
            System.out.println("Já estava ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("Desligado corretamente.");
        } else {
            System.out.println("Já estava desligado.");
        }
    }

    public void aumentarVolume(int aumento) {
        if (ligado) {
            if (volume < 100 && aumento <= 100 - volume) {
                volume += aumento;
                System.out.println("Volume aumentado para: " + volume);
            } else {
                System.out.println("Volume já está no máximo ou aumento inválido.");
            }
        } else {
            System.out.println("Não é possível alterar o volume. A TV está desligada.");
        }
    }

    // Getters e Setters
    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if (ligado) {
            this.canal = canal;
            System.out.println("Canal alterado para: " + canal);
        } else {
            System.out.println("Não é possível mudar de canal. A TV está desligada.");
        }
    }

    public int getVolume() {
        return volume;
    }

    public boolean isLigado() {
        return ligado;
    }
}
