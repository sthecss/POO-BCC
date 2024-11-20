import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public abstract class Estudante extends Pessoa implements Serializable {
    // ================================= Atributos:
    @Serial
    private static final long serialVersionUID = 1L;
    private Double cra;
    private String codMatricula;


    // ================================= Construtor:
    public Estudante(CPF cpf, String nome, LocalDate dNascimento, String codMatricula, Double cra) {
        super(cpf, nome, dNascimento);
        this.codMatricula = codMatricula;
        this.cra = cra;
    }

    public Estudante() {super();}


    // ================================= Getters e Setters
    public Double getCra() { return cra; }
    public void setCra(Double cra) { this.cra = cra; }

    public String getCodMatricula() { return codMatricula; }


    // ================================= Outros Métodos
    void consultarDisciplinasMatriculadas(List<Matricula> matriculas, String codMatriculaEstudante) {}

    void consultarHistorico(List<Matricula> matriculas, String codMatriculaEstudante){}


}