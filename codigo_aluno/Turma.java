package codigo_aluno;

public class Turma {

    // Atributos
    private Aluno[] alunos = new Aluno[5];
    private int quantidade = 0;

    // Adiciona aluno
    public void adicionarAluno(Aluno aluno) {
        if (quantidade < alunos.length) {
            alunos[quantidade] = aluno; // Adiciona o nv aluno na posição atual do array
            quantidade++; 
        } 
        
        else {
            System.out.println("Turma cheia!");
        }
    }

    // Lista todos os alunos
    public void listarAlunos() {
        System.out.println("==== Listar Alunos ====");
        for (int i = 0; i < quantidade; i++) {
            alunos[i].exibirInfo();
            System.out.println(); 
        }
    }

    // Busca aluno por matrícula
    public Aluno buscarPorMatricula(int matricula) { // Retornar um objeto do tipo aluno
        for (int i = 0; i < quantidade; i++) {
            if (alunos[i].getMatricula() == matricula) {
                return alunos[i];
            }
        }
        return null;
    }
}
