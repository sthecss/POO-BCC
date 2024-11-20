import java.io.Serializable;
import java.time.LocalDate;

public class Matricula implements Serializable, ValidadorData{
    // ================================= Atributos
    private static final long serialVersionUID = 1L;
    private Estudante aluno;
    private Disciplina disciplina;
    private LocalDate data;
    private int nota;


    // ================================= Construtores
    public Matricula(Estudante aluno, Disciplina disciplina, LocalDate data) {
        if (aluno instanceof EGraduacao) {
            EGraduacao gradAluno = (EGraduacao) aluno;
            this.aluno = new EGraduacao(
                    gradAluno.getCpf(),
                    gradAluno.getNome(),
                    gradAluno.getdNascimento(),
                    gradAluno.getCodMatricula(),
                    gradAluno.getCra(),
                    gradAluno.getEstagio()
            );
        } else if (aluno instanceof EPosGrad) {
            EPosGrad posAluno = (EPosGrad) aluno;
            this.aluno = new EPosGrad(
                    posAluno.getCpf(),
                    posAluno.getNome(),
                    posAluno.getdNascimento(),
                    posAluno.getCodMatricula(),
                    posAluno.getCra(),
                    posAluno.getTemaPesquisa()
            );
        } else {
            throw new IllegalArgumentException("Tipo de estudante inválido");
        }
        this.disciplina = new Disciplina(
                disciplina.getTurmaAtual(),
                disciplina.getCodigo(),
                disciplina.getNome(),
                disciplina.getCargaHorario()
        );
        this.data = data;
    }


    // ================================= Getters e Setters
    public Estudante getAluno() { return aluno; }
    public Disciplina getDisciplina() { return disciplina; }
    public LocalDate getData() { return data; }
    public int getNota() {
        return nota;
    }
    public void setNota(int nota) throws ErroArgumentoException {
        if (nota < 0 || nota > 100) {
            throw new ErroArgumentoException("Nota inválida. A nota deve ser entre 0 e 100.");
        }
        this.nota = nota;
    }

    // ================================= Outros Métodos
    public void definirCodigoMatricula(String codMatricula) {
        if (codMatricula == null || codMatricula.trim().isEmpty()) {
            throw new ErroArgumentoException("Código de matrícula não pode ser vazio.");
        }
        if (codMatricula.length() != 10) { // Exemplo de um código de matrícula com 10 caracteres
            throw new ErroArgumentoException("Código de matrícula deve ter exatamente 10 caracteres.");
        }
    }

    @Override
    public void validarData(int dia, int mes, int ano) throws ErroArgumentoException {
        // Lógica de validação da data (dia, mes, ano) para matrícula
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Verificar se é ano bissexto e ajustar fevereiro
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            diasPorMes[1] = 29;
        }

        // Verificar se o dia é válido para o mês específico
        if (dia < 1 || dia > diasPorMes[mes - 1]) {
            throw new ErroArgumentoException("Dia " + dia + " é inválido para o mês " + mes + " do ano " + ano + ".");
        }
    }

}
