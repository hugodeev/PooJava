public class ExemploVetorMain {

    private String nome;
    private int idade;

    public ExemploVetorMain(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String toString(){
        return String.format("Nome: %s, Idade: %d", nome, idade);
    }

}
