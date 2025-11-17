public class Encomenda {
    // Atributos da encomenda
    private int codigo;
    private String destinatario;
    private String endereco;
    private String status;

    // Construtor para inicializar todos os atributos
    public Encomenda(int codigo, String destinatario, String endereco, String status) {
        this.codigo = codigo;
        this.destinatario = destinatario;
        this.endereco = endereco;
        this.status = status;
    }

    // Método para exibir todas as informações da encomenda no console
    public void exibirInfo() {
        System.out.println("--- Dados da Encomenda ---");
        System.out.println("Código: " + this.codigo);
        System.out.println("Destinatário: " + this.destinatario);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Status: " + this.status);
    }

    // Método para alterar o status da encomenda
    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
        System.out.println("Status da encomenda " + this.codigo + " atualizado para: " + this.status);
    }
    
    // Método getter para o código (útil para a busca)
    public int getCodigo() {
        return this.codigo;
    }
}