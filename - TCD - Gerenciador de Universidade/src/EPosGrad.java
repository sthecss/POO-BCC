import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class EPosGrad extends Estudante{
    // ================================= Atributos
    private String temaPesquisa;


    // ================================= Construtores
    public EPosGrad(CPF cpf, String nome, LocalDate dNascimento, String codMatricula, Double cra, String temaPesquisa) {
        super(cpf, nome, dNascimento, codMatricula, cra);

        this.temaPesquisa = temaPesquisa;
    }


    // ================================= Getters e Setters
    public String getTemaPesquisa() { return temaPesquisa; }

    // ================================= Outros Métodos
    public void validarData(int dia, int mes, int ano) throws ErroArgumentoException {
        // Número de dias válidos por mês
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Verificar se é ano bissexto e ajustar fevereiro
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            diasPorMes[1] = 29; // Fevereiro tem 29 dias em anos bissextos
        }

        // Verificar se o dia é válido para o mês específico
        if (dia < 1 || dia > diasPorMes[mes - 1]) {
            throw new ErroArgumentoException("Dia " + dia + " é inválido para o mês " + mes + " do ano " + ano + ".");
        }
    }
    protected void consultarDisciplinasMatriculadas(List<Matricula> matriculas, String codMatriculaEstudante) {
        System.out.println("\nDisciplinas Matriculadas:");

        for (Matricula matricula : matriculas) {
            if (matricula.getAluno().getCodMatricula().equals(codMatriculaEstudante)) {
                System.out.println(" - " + matricula.getDisciplina().getNome() +
                        " (Turma: " + matricula.getDisciplina().getTurmaAtual().getCodTurma() + ")");
            }
        }
    }
    protected void consultarHistorico(List<Matricula> matriculas, String codMatriculaEstudante) {
        System.out.println("\nHistórico Acadêmico:");

        // atencao especial NISSO DAQUI! .stream() é luz, é pão, é água!!
        // provavelmente o surto mais genial (e menos aproveitado por pouca qtd de infos) desse código!!
        // filter está aqui para filtrar elementos de acordo com uma condição aí
        // a sorted ordena de forma crescente
        // forEach encarem como um "eco", ele percorre
        matriculas.stream()
                .filter(m -> m.getAluno().getCodMatricula().equals(codMatriculaEstudante))
                .sorted(Comparator.comparing(Matricula::getData))
                .forEach(matricula -> System.out.println(" - Disciplina: " + matricula.getDisciplina().getNome() +
                        " | Nota: " + matricula.getNota() +
                        " | Data: " + matricula.getData()));
    }


}
