public class Candidato {
    // ==================== ATRIBUTOS :
    protected String nomeCompleto;
    protected String dataNascimento;
    protected String sexo;
    protected String totalBens;
    protected Boolean reeleicao;
    protected int partido;


    // ==================== CONSTRUTOR :
    public Candidato(String nomeCompleto, String dataNascimento, String sexo, String totalBens,
                     Boolean reeleicao, int partido) {
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.totalBens = totalBens;
        this.reeleicao = reeleicao;
        this.partido = partido;
    }

    // ==================== DEMAIS METODOS :
    @Override
    public String toString() {
        return "CANDIDATO {" +
                "Nome Completo='" + nomeCompleto + '\'' +
                ", Data de Nascimento='" + dataNascimento + '\'' +
                ", Sexo='" + sexo + '\'' +
                ", Total de Bens='" + totalBens + '\'' +
                ", Reeleição=" + reeleicao +
                ", Partido=" + partido + "}";
    }
}
