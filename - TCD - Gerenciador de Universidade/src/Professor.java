import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Professor extends Pessoa implements Serializable {
    // ================================= Atributos:
    private static final long serialVersionUID = 1L;
    private LocalDate inicioContrato;
    private String departamento;
    private List<Disciplina> disciplinas;
    private List<Matricula> chamada;

    // ================================= Construtores:
    public Professor(CPF cpf, String nome, LocalDate dNascimento, LocalDate inicioContrato, String departamento) {
        super(cpf, nome, dNascimento);
        this.inicioContrato = inicioContrato;
        this.departamento = departamento;

        // ================================= Ajuste para inicializar os ArrayLists
        this.disciplinas = new ArrayList<>();

        this.chamada = new ArrayList<>();
    }

    // ================================= Getters e Setters
    public LocalDate getInicioContrato() { return inicioContrato; }
    public String getDepartamento() { return departamento; }
    public List<Disciplina> getDisciplinas() { return disciplinas; }

    // ================================= Outros Métodos
    public void adicionarDisciplina(Disciplina disciplina) {
        if (!disciplinas.contains(disciplina)) {
            disciplinas.add(disciplina);
            disciplina.setProfessor(this);
        }
    }
    public void adicionarMatricula(Matricula matricula) {
        if (!chamada.contains(matricula) && disciplinas.contains(matricula.getDisciplina())) {
            chamada.add(matricula);
        }
    }
    public void definirNota(int nota) {
        if (nota < 0 || nota > 100) {
            throw new ErroArgumentoException("Nota deve ser entre 0 e 10.");
        }
    }

    @Override
    public void validarData(int dia, int mes, int ano) throws ErroArgumentoException {
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            diasPorMes[1] = 29; // Fevereiro tem 29 dias em anos bissextos
        }

        if (dia < 1 || dia > diasPorMes[mes - 1]) {
            throw new ErroArgumentoException("Dia " + dia + " é inválido para o mês " + mes + " do ano " + ano + ".");
        }
    }

    private static int verificaTrabalho(Professor professor) {
        if (professor.getDisciplinas().isEmpty()) {
            System.out.println("\nO(a) professor(a) " + professor.getNome() + " não possui disciplinas"+
                    "\ncadastradas. Voltando...");
            return -1;
        }
        return 0;
    }
    static void visualizarTurmas(Professor professor) {
        if (verificaTrabalho(professor) == -1)  return;

        System.out.println("Turmas ministradas por " + professor.getNome() + ":");
        for (Disciplina disciplina : professor.getDisciplinas()) {
            System.out.println("Disciplina: " + disciplina.getNome() +
                    " | Turma: " + disciplina.getTurmaAtual().getCodTurma());
        }
    }
    static void lancarNotas(Professor professor, List<Matricula> matriculas, Scanner scanner) {
        if (verificaTrabalho(professor) == -1)  return;

        String cor = "\u001B[36m"; String reset = "\u001B[0m";

        System.out.println(cor+"\nDisciplinas do professor " + reset + professor.getNome() + ":");

        List<Disciplina> disciplinas = professor.getDisciplinas();
        for (int i = 0; i < disciplinas.size(); i++) {
            Disciplina disciplina = disciplinas.get(i);
            System.out.println(cor + (i + 1) + reset+ ". " + disciplina.getNome() + " (Código: " + disciplina.getCodigo() + ")");
        }

        System.out.print(cor + "\nEscolha a disciplina pela posição (1 a " + disciplinas.size() + "): " + reset);
        int posicaoEscolhida = scanner.nextInt();
        scanner.nextLine();

        if (posicaoEscolhida < 0 || posicaoEscolhida > disciplinas.size()) {
            System.out.println("Posição inválida! Operação cancelada.");
            return;
        }

        Disciplina disciplinaSelecionada = disciplinas.get(posicaoEscolhida-1);

        System.out.println(cor+ "\nAlunos matriculados na disciplina " + reset + disciplinaSelecionada.getNome() + ":");
        for (Matricula matricula : matriculas) {
            if (matricula.getDisciplina().getNome().equals(disciplinaSelecionada.getNome())) {
                System.out.print("-> Digite a nota para " + matricula.getAluno().getNome() + ": ");
                int nota = scanner.nextInt();
                matricula.setNota(nota);
                System.out.println("< Nota lançada com sucesso. >");
            }
        }
        // Após modificar as notas, salva novamente o arquivo _matriculas.bin
        Persistencia.salvar("persistencia_dados" + "/_matriculas.bin", matriculas);
        System.out.println("Notas atualizadas e arquivo _matriculas.bin salvo com sucesso.");
    }
    static void consultarEstudantes(Professor professor, List<Matricula> matriculas, Scanner scanner) {
        if (verificaTrabalho(professor) == -1)  return;

        String cor = "\u001B[36m"; String reset = "\u001B[0m";

        System.out.println(cor + "Disciplinas do professor " + reset + professor.getNome() + ":");

        // Exibir disciplinas com índice
        for (int i = 0; i < professor.getDisciplinas().size(); i++) {
            Disciplina disciplina = professor.getDisciplinas().get(i);
            System.out.println((i + 1) + ". " + disciplina.getCodigo() + ": " + disciplina.getNome());
        }

        System.out.print("\n-> Digite o número da disciplina para consultar os estudantes: ");
        int indiceDisciplina = scanner.nextInt();
        scanner.nextLine();

        if (indiceDisciplina < 1 || indiceDisciplina > professor.getDisciplinas().size()) {
            System.out.println("Opção inválida! Consulta cancelada.");
            return;
        }

        Disciplina disciplinaSelecionada = professor.getDisciplinas().get(indiceDisciplina - 1);

        System.out.println(cor + "\nEstudantes matriculados na disciplina " + disciplinaSelecionada.getNome() + ":" + reset);
        for (Matricula matricula : matriculas) {
            if (matricula.getDisciplina().getCodigo() == disciplinaSelecionada.getCodigo()) {
                System.out.println(cor + " - " + reset + matricula.getAluno().getNome());
            }
        }
    }
    static void consultarDesempenho(Professor professor, List<Matricula> matriculas, Scanner scanner) {
        if (verificaTrabalho(professor) == -1)  return;

        String cor = "\u001B[36m"; String reset = "\u001B[0m";

        System.out.println(cor + "Disciplinas do professor " + reset + professor.getNome() + ":");

        // Exibir disciplinas com índice
        for (int i = 0; i < professor.getDisciplinas().size(); i++) {
            Disciplina disciplina = professor.getDisciplinas().get(i);
            System.out.println((i + 1) + ". " + disciplina.getCodigo() + ": " + disciplina.getNome());
        }

        System.out.print(cor + "\n-> Digite o número da disciplina para consultar o desempenho dos estudantes: " + reset);
        int indiceDisciplina = scanner.nextInt();
        scanner.nextLine();

        if (indiceDisciplina < 1 || indiceDisciplina > professor.getDisciplinas().size()) {
            System.out.println("Opção inválida! Consulta cancelada.");
            return;
        }

        Disciplina disciplinaSelecionada = professor.getDisciplinas().get(indiceDisciplina - 1);

        System.out.println(cor+ "\nDesempenho dos estudantes na disciplina " + disciplinaSelecionada.getNome() + ":" + reset);
        for (Matricula matricula : matriculas) {
            if (matricula.getDisciplina().getCodigo() == disciplinaSelecionada.getCodigo()) {
                System.out.println(" - " + matricula.getAluno().getNome() + ": Nota = " + matricula.getNota());
            }
        }
    }


}
