import java.io.Serializable;
import java.time.LocalDate;

public class Pessoa implements Serializable, ValidadorData{
    // ================================= Atributos
    private static final long serialVersionUID = 1L;
    protected CPF cpf;
    protected String nome;
    protected LocalDate dNascimento;


    // ================================= Construtores
    public Pessoa(CPF cpf, String nome, LocalDate dNascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.dNascimento = dNascimento;
    }

    public Pessoa() {}


    // ================================= Getters e Setters
    public String getNome() { return nome; }
    public LocalDate getdNascimento() { return dNascimento; }
    public CPF getCpf() { return cpf; }


    // ================================= Outros Métodos
    public void definirNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new ErroArgumentoException("Nome não pode ser vazio.");
        }
        if (!nome.matches("[a-zA-ZÀ-ú ]+")) {
            throw new ErroArgumentoException("Nome contém caracteres inválidos.");
        }
    }

    @Override
    public void validarData(int dia, int mes, int ano) throws ErroArgumentoException {}
}
