package codigo_aluno;

public class Turma {

    // Atributos
    private Aluno[] alunos = new Aluno[5];
    private int quantidade = 0;

    // Adiciona aluno
    public void adicionarAluno(Aluno aluno) {
        if (quantidade < alunos.length) {
            alunos[quantidade] = aluno;
            quantidade++;
        } else {
            System.out.println("Turma cheia!");
        }
    }

    // Lista todos os alunos
    public void listarAlunos() {
        System.out.println("==== Listar Alunos ====");
        for (int i = 0; i < quantidade; i++) {
            alunos[i].exibirInfo();
            System.out.println(); // Linha em branco entre os alunos
        }
    }

    // Busca aluno por matrícula
    public Aluno buscarPorMatricula(int matricula) {
        for (int i = 0; i < quantidade; i++) {
            if (alunos[i].getMatricula() == matricula) {
                return alunos[i]; // Agora retorna o aluno corretamente
            }
        }
        return null;
    }
}
