public class Main {
    public static void main(String[] args) {
        Televisor televisor = new Televisor(5, 0);
        ControleRemoto controleRemoto = new ControleRemoto(televisor);

        // Usando o controle remoto para ligar o televisor
        controleRemoto.ligar();
        
        // Aumentando o volume
        controleRemoto.aumentarVolume(100);

        // Diminuindo o volume
        controleRemoto.diminuirVolume(50);

        // Trocando o canal
        controleRemoto.trocarCanal(10);
        
        // Exibindo o status do Televisor
        controleRemoto.exibirStatus();

        // Desligando o Televisor
        controleRemoto.desligar();
        
        // Tentando alterar o volume enquanto o televisor está desligado
        controleRemoto.aumentarVolume(5);

    }
}