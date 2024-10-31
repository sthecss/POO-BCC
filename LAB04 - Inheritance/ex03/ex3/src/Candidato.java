public class Candidato {
    // ==================== ATRIBUTOS :
    private String nomeCompleto;
    private String dataNascimento;
    private String sexo;
    private String totalBens;
    private Boolean reeleicao;
    private int partido;

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

    // ==================== GETTERS :
    public String getNomeCompleto() { return nomeCompleto; }
    public String getDataNascimento() { return dataNascimento; }
    public String getSexo() { return sexo; }
    public String getTotalBens() { return totalBens; }
    public Boolean getReeleicao() { return reeleicao; }
    public int getPartido() { return partido; }

    // ==================== toString :
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
