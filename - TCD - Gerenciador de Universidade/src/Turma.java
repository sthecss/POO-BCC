import java.io.Serializable;
import java.time.LocalDate;

public class Turma implements Serializable {
    // ================================= Atributos
    private static final long serialVersionUID = 1L;
    private int semestre;
    private LocalDate anoCorrente;
    private String codTurma;


    // ================================= Construtores
    public Turma(LocalDate anoCorrente, int semestre) {
        this.semestre = semestre;
        this.anoCorrente = anoCorrente;
        this.codTurma = "cod"+anoCorrente.getYear() + "/" + semestre;
    }


    // ================================= Getters e Setters
    public int getSemestre() { return semestre; }
    public LocalDate getAnoCorrente() { return anoCorrente; }
    public String getCodTurma() { return codTurma; }

    // ================================= Outros Métodos:
    public void validarAno(int ano) {
        if (ano < LocalDate.now().getYear()) {
            throw new ErroArgumentoException("Ano da turma não pode ser inferior ao ano atual.");
        }
    }

    public void validarSemestre(int semestre) {
        if (semestre < 1 || semestre > 2) {
            throw new ErroArgumentoException("Semestre inválido. Deve ser 1 ou 2.");
        }
    }
}
