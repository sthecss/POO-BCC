public class CandidatoVereador {
    // ==================== ATRIBUTOS :
    String nomeCompleto;
    String dataNascimento;
    String sexo;
    String totalBens;
    Boolean reeleicao;
    int partido;
    String numeroVereador;
    String bairro;

    // ==================== CONSTRUTORES :
    public CandidatoVereador(String nomeCompleto, String dataNascimento, String sexo, String totalBens,
                             Boolean reeleicao, int partido, String numeroVereador, String bairro) {
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.totalBens = totalBens;
        this.reeleicao = reeleicao;
        this.partido = partido;
        this.numeroVereador = numeroVereador;
        this.bairro = bairro;
    }

    // ==================== toString :
    @Override
    public String toString() {
        return "CANDIDATO A VEREADOR {" +
                "Nome Completo='" + nomeCompleto + '\'' +
                ", Data de Nascimento='" + dataNascimento + '\'' +
                ", Sexo='" + sexo + '\'' +
                ", Total de Bens='" + totalBens + '\'' +
                ", Reeleição=" + reeleicao +
                ", Partido=" + partido +
                ", Número='" + numeroVereador + '\'' +
                ", Bairro='" + bairro + '\'' + "}";
    }
}
