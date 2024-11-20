import java.io.Serial;
import java.io.Serializable;

public class Disciplina implements Serializable {
    // ================================= Atributos
    @Serial
    private static final long serialVersionUID = 1L;
    private int codigo;
    private String nome;
    private int cargaHorario;
    private Turma turmaAtual;
    private Professor professor;


    // ================================= Construtores
    public Disciplina(Turma turmaAtual, int codigo, String nome, int cargaHorario) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHorario = cargaHorario;
        this.turmaAtual = turmaAtual;
    }

    // ================================= Getters e Setters
    public Turma getTurmaAtual() { return turmaAtual; }
    public int getCodigo() { return codigo; }
    public String getNome() { return nome; }
    public int getCargaHorario() { return cargaHorario; }
    public Professor getProfessor() { return professor; }
    public void setProfessor(Professor professor) {
        this.professor = new Professor(
                professor.getCpf(),
                professor.getNome(),
                professor.getdNascimento(),
                professor.getInicioContrato(),
                professor.getDepartamento());
    }

    // ================================= Outros Métodos:
    public void validarCodigo(int codigo) {
        if (codigo <= 0) {
            throw new ErroArgumentoException("Código da disciplina deve ser um número positivo.");
        }
    }

    public void validarCargaHoraria(int cargaHoraria) {
        if (cargaHoraria <= 0) {
            throw new ErroArgumentoException("Carga horária deve ser maior que zero.");
        }
    }

}
