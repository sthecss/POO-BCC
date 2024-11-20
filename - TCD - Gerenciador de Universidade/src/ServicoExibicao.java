import java.util.List;
import java.util.Scanner;

public class ServicoExibicao {
    public static void menuMostrarDados(String diretorio) {
        Scanner scanner = new Scanner(System.in);
        List<Estudante> estudantes = Persistencia.carregar(diretorio + "/_estudantes.bin");
        List<Professor> professores = Persistencia.carregar(diretorio + "/_professores.bin");
        List<Disciplina> disciplinas = Persistencia.carregar(diretorio + "/_disciplinas.bin");
        List<Matricula> matriculas = Persistencia.carregar(diretorio + "/_matriculas.bin");
        List<Turma> turmas = Persistencia.carregar(diretorio + "/_turmas.bin");

        String cor = "\u001B[36m";  // Azul
        String reset = "\u001B[0m"; // Reset para cor padrão

        int opcao;
        do {
            // Exibindo o menu
            System.out.println(cor + "\n===============================");
            System.out.println("        MENU DE EXIBIÇÃO");
            System.out.println("===============================\n" + reset);
            System.out.println("1. Estudantes");
            System.out.println("2. Professores");
            System.out.println("3. Disciplinas");
            System.out.println("4. Matrículas");
            System.out.println("5. Turmas");
            System.out.println("6. Exibir Todos");
            System.out.println("0. Sair");
            System.out.print("\n-> Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha

            switch (opcao) {
                case 1:
                    exibirEstudantes(estudantes, cor, reset);
                    break;
                case 2:
                    exibirProfessores(professores, cor, reset);
                    break;
                case 3:
                    exibirDisciplinas(disciplinas, cor, reset);
                    break;
                case 4:
                    exibirMatriculas(matriculas, cor, reset);
                    break;
                case 5:
                    exibirTurmas(turmas, cor, reset);
                    break;
                case 6:
                    exibirEstudantes(estudantes, cor, reset);
                    exibirProfessores(professores, cor, reset);
                    exibirDisciplinas(disciplinas, cor, reset);
                    exibirMatriculas(matriculas, cor, reset);
                    exibirTurmas(turmas, cor, reset);
                    break;
                case 0:
                    System.out.println("Saindo do menu...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }
    private static void exibirEstudantes(List<Estudante> estudantes, String cor, String reset) {
        System.out.println(cor + "\n===============================");
        System.out.println("         ESTUDANTES");
        System.out.println("===============================\n" + reset);
        if (estudantes != null) {
            for (Estudante estudante : estudantes) {
                System.out.println("Nome: " + estudante.getNome());
                System.out.println(estudante.getCpf());
                System.out.println("Data de Nascimento: " + estudante.getdNascimento());
                System.out.println("CRA: " + estudante.getCra());
                System.out.println("Código de Matrícula: " + estudante.getCodMatricula());
                if (estudante instanceof EGraduacao) {
                    System.out.println("Tipo: Estágio Supervisionado");
                    System.out.println("Estágio: " + ((EGraduacao) estudante).getEstagio());
                } else if (estudante instanceof EPosGrad) {
                    System.out.println("Tipo: Tema de Pesquisa");
                    System.out.println("Tema: " + ((EPosGrad) estudante).getTemaPesquisa());
                }
                System.out.println("-------------------------------\n");
            }
        } else {
            System.out.println("Nenhum estudante encontrado.\n");
        }
    }
    private static void exibirProfessores(List<Professor> professores, String cor, String reset) {
        System.out.println(cor + "\n===============================");
        System.out.println("         PROFESSORES");
        System.out.println("===============================\n" + reset);
        if (professores != null) {
            for (Professor professor : professores) {
                System.out.println("Nome: " + professor.getNome());
                System.out.println(professor.getCpf());
                System.out.println("Data de Nascimento: " + professor.getdNascimento());
                System.out.println("Início de Contrato: " + professor.getInicioContrato());
                System.out.println("Departamento: " + professor.getDepartamento());
                System.out.println("-------------------------------\n");
            }
        } else {
            System.out.println("Nenhum professor encontrado.\n");
        }
    }
    private static void exibirDisciplinas(List<Disciplina> disciplinas, String cor, String reset) {
        System.out.println(cor + "\n===============================");
        System.out.println("         DISCIPLINAS");
        System.out.println("===============================\n" + reset);
        if (disciplinas != null) {
            for (Disciplina disciplina : disciplinas) {
                System.out.println("Código: " + disciplina.getCodigo());
                System.out.println("Nome: " + disciplina.getNome());
                System.out.println("Carga Horária: " + disciplina.getCargaHorario());
                System.out.println("Professor: " + disciplina.getProfessor().getNome());
                System.out.println("-------------------------------\n");
            }
        } else {
            System.out.println("Nenhuma disciplina encontrada.\n");
        }
    }
    private static void exibirMatriculas(List<Matricula> matriculas, String cor, String reset) {
        System.out.println(cor + "\n===============================");
        System.out.println("         MATRÍCULAS");
        System.out.println("===============================\n" + reset);
        if (matriculas != null) {
            for (Matricula matricula : matriculas) {
                System.out.println("Aluno: " + matricula.getAluno().getNome());
                System.out.println("Disciplina: " + matricula.getDisciplina().getNome());
                System.out.println("Nota: " + matricula.getNota());
                System.out.println("Data de Matrícula: " + matricula.getData());
                System.out.println("-------------------------------\n");
            }
        } else {
            System.out.println("Nenhuma matrícula encontrada.\n");
        }
    }
    private static void exibirTurmas(List<Turma> turmas, String cor, String reset) {
        System.out.println(cor + "\n===============================");
        System.out.println("         TURMAS");
        System.out.println("===============================\n" + reset);
        if (turmas != null) {
            for (Turma turma : turmas) {
                System.out.println("Semestre: " + turma.getSemestre());
                System.out.println("Ano Corrente: " + turma.getAnoCorrente());
                System.out.println("Codigo: " + turma.getCodTurma());
                System.out.println("-------------------------------\n");
            }
        } else {
            System.out.println("Nenhuma turma encontrada.\n");
        }
    }

}
