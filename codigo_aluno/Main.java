package codigo_aluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Turma turma = new Turma();

        // Adiciona 3 alunos
        turma.adicionarAluno(new Aluno("Hugo", 102, 8.5, 7.0));
        turma.adicionarAluno(new Aluno("Davi", 200, 9.5, 10.0));
        turma.adicionarAluno(new Aluno("Victor", 100, 0.0, 4.0));

        // Lista todos os alunos
        turma.listarAlunos();

        // Busca por matrícula
        System.out.println("=== Buscar Aluno ===");
        System.out.print("Digite sua matrícula: ");
        int matricula = sc.nextInt();

        Aluno encontrado = turma.buscarPorMatricula(matricula);
        if (encontrado != null) {
            System.out.println("\nAluno encontrado:");
            encontrado.exibirInfo();
        } else {
            System.out.println("Aluno não encontrado.");
        }

        sc.close();
    }
}
