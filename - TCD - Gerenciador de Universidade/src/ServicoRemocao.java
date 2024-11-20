import java.util.List;
import java.util.Scanner;

public class ServicoRemocao {
    public static void menuRemoverDados(String diretorio) {
        Scanner scanner = new Scanner(System.in);

        String cor = "\u001B[36m";  String reset = "\u001B[0m";

        int opcao;
        do {
            System.out.println(cor + "\n===============================");
            System.out.println("        MENU DE REMOÇÃO");
            System.out.println("===============================\n" + reset);
            System.out.println("1. Remover Estudante");
            System.out.println("2. Remover Professor");
            System.out.println("3. Remover Disciplina");
            System.out.println("4. Remover Matrícula");
            System.out.println("5. Remover Turma");
            System.out.println("0. Sair");
            System.out.print("\n-> Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    removerEstudante(diretorio);
                    break;
                case 2:
                    removerProfessor(diretorio);
                    break;
                case 3:
                    removerDisciplina(diretorio);
                    break;
                case 4:
                    removerMatricula(diretorio);
                    break;
                case 5:
                    removerTurma(diretorio);
                    break;
                case 0:
                    System.out.println("Saindo do menu...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }
    private static void removerEstudante(String diretorio) {
        Scanner scanner = new Scanner(System.in);
        String caminhoArquivo = diretorio + "/_estudantes.bin";

        String cor = "\u001B[36m";  String reset = "\u001B[0m";

        List<Estudante> estudantes = Persistencia.carregar(caminhoArquivo);
        if (estudantes == null || estudantes.isEmpty()) {
            System.out.println("Nenhum estudante encontrado para remover.");
            return;
        }

        System.out.println(cor + "\nLista de Estudantes:" + reset);
        for (int i = 0; i < estudantes.size(); i++) {
            Estudante estudante = estudantes.get(i);
            System.out.println((i + 1) + ". Nome: " + estudante.getNome() + " | Matrícula: " + estudante.getCodMatricula());
        }

        System.out.print(cor + "\nEscolha o número do estudante para remover: "+reset);
        int escolha = scanner.nextInt();
        scanner.nextLine();

        if (escolha < 1 || escolha > estudantes.size()) {
            System.out.println("\nOpção inválida! Nenhuma alteração feita.");
            return;
        }

        estudantes.remove(escolha - 1);

        Persistencia.salvar(caminhoArquivo, estudantes);
        System.out.println("\nEstudante removido com sucesso!");
    }
    private static void removerProfessor(String diretorio) {
        Scanner scanner = new Scanner(System.in);
        String caminhoArquivo = diretorio + "/_professores.bin";

        String cor = "\u001B[36m"; String reset = "\u001B[0m";

        List<Professor> professores = Persistencia.carregar(caminhoArquivo);
        if (professores == null || professores.isEmpty()) {
            System.out.println(cor + "\nNenhum professor encontrado para remover." + reset);
            return;
        }

        System.out.println(cor + "\nLista de Professores:" + reset);
        for (int i = 0; i < professores.size(); i++) {
            Professor professor = professores.get(i);
            System.out.println((i + 1) + ". Nome: " + professor.getNome() + " | CPF: " + professor.getCpf());
        }

        System.out.print(cor + "\nEscolha o número do professor para remover: " + reset);
        int escolha = scanner.nextInt();
        scanner.nextLine();

        if (escolha < 1 || escolha > professores.size()) {
            System.out.println(cor + "\nOpção inválida! Nenhuma alteração feita." + reset);
            return;
        }

        professores.remove(escolha - 1);

        Persistencia.salvar(caminhoArquivo, professores);
        System.out.println(cor + "\nProfessor removido com sucesso!" + reset);
    }
    private static void removerDisciplina(String diretorio) {
        Scanner scanner = new Scanner(System.in);
        String caminhoArquivo = diretorio + "/_disciplinas.bin";

        String cor = "\u001B[36m"; String reset = "\u001B[0m";

        List<Disciplina> disciplinas = Persistencia.carregar(caminhoArquivo);
        if (disciplinas == null || disciplinas.isEmpty()) {
            System.out.println(cor + "\nNenhuma disciplina encontrada para remover." + reset);
            return;
        }

        System.out.println(cor + "\nLista de Disciplinas:" + reset);
        for (int i = 0; i < disciplinas.size(); i++) {
            Disciplina disciplina = disciplinas.get(i);
            System.out.println((i + 1) + ". Código: " + disciplina.getCodigo() + " | Nome: " + disciplina.getNome());
        }

        System.out.print(cor + "\nEscolha o número da disciplina para remover: " + reset);
        int escolha = scanner.nextInt();
        scanner.nextLine();

        if (escolha < 1 || escolha > disciplinas.size()) {
            System.out.println(cor + "\nOpção inválida! Nenhuma alteração feita." + reset);
            return;
        }

        disciplinas.remove(escolha - 1);

        Persistencia.salvar(caminhoArquivo, disciplinas);
        System.out.println(cor + "\nDisciplina removida com sucesso!" + reset);
    }
    private static void removerMatricula(String diretorio) {
        Scanner scanner = new Scanner(System.in);
        String caminhoArquivo = diretorio + "/_matriculas.bin";

        String cor = "\u001B[36m"; String reset = "\u001B[0m";

        List<Matricula> matriculas = Persistencia.carregar(caminhoArquivo);
        if (matriculas == null || matriculas.isEmpty()) {
            System.out.println(cor + "\nNenhuma matrícula encontrada para remover." + reset);
            return;
        }

        System.out.println(cor + "\nLista de Matrículas:" + reset);
        for (int i = 0; i < matriculas.size(); i++) {
            Matricula matricula = matriculas.get(i);
            System.out.println((i + 1) + ". Aluno: " + matricula.getAluno().getNome() +
                    " | Disciplina: " + matricula.getDisciplina().getNome() +
                    " | Data: " + matricula.getData());
        }

        System.out.print(cor + "\nEscolha o número da matrícula para remover: " + reset);
        int escolha = scanner.nextInt();
        scanner.nextLine();

        if (escolha < 1 || escolha > matriculas.size()) {
            System.out.println(cor + "\nOpção inválida! Nenhuma alteração feita." + reset);
            return;
        }

        matriculas.remove(escolha - 1);

        Persistencia.salvar(caminhoArquivo, matriculas);
        System.out.println(cor + "\nMatrícula removida com sucesso!" + reset);
    }
    private static void removerTurma(String diretorio) {
        Scanner scanner = new Scanner(System.in);
        String caminhoArquivo = diretorio + "/_turmas.bin";

        String cor = "\u001B[36m"; String reset = "\u001B[0m";

        List<Turma> turmas = Persistencia.carregar(caminhoArquivo);
        if (turmas == null || turmas.isEmpty()) {
            System.out.println(cor + "\nNenhuma turma encontrada para remover." + reset);
            return;
        }

        System.out.println(cor + "\nLista de Turmas:" + reset);
        for (int i = 0; i < turmas.size(); i++) {
            Turma turma = turmas.get(i);
            System.out.println((i + 1) + ". Código: " + turma.getCodTurma() +
                    " | Semestre: " + turma.getSemestre() +
                    " | Ano: " + turma.getAnoCorrente().getYear());
        }

        System.out.print(cor + "\nEscolha o número da turma para remover: " + reset);
        int escolha = scanner.nextInt();
        scanner.nextLine();

        if (escolha < 1 || escolha > turmas.size()) {
            System.out.println(cor + "\nOpção inválida! Nenhuma alteração feita." + reset);
            return;
        }

        turmas.remove(escolha - 1);

        Persistencia.salvar(caminhoArquivo, turmas);
        System.out.println(cor + "\nTurma removida com sucesso!" + reset);
    }

}
