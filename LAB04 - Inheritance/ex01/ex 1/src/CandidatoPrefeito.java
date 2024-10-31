public class CandidatoPrefeito {
    // ==================== ATRIBUTOS :
    String nomeCompleto;
    String dataNascimento;
    String sexo;
    String totalBens;
    Boolean reeleicao;
    int partido;
    String nomeVice;
    int partidoVice;

    // ==================== CONSTRUTORES :
    public CandidatoPrefeito(String nomeCompleto, String dataNascimento, String sexo, String totalBens,
                             Boolean reeleicao, int partido, String nomeVice, int partidoVice) {
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.totalBens = totalBens;
        this.reeleicao = reeleicao;
        this.partido = partido;
        this.nomeVice = nomeVice;
        this.partidoVice = partidoVice;
    }

    // ==================== toString :
    @Override
    public String toString() {
        return "CANDIDATO A PREFEITO {" +
                "Nome Completo='" + nomeCompleto + '\'' +
                ", Data de Nascimento='" + dataNascimento + '\'' +
                ", Sexo='" + sexo + '\'' +
                ", Total de Bens='" + totalBens + '\'' +
                ", Reeleição=" + reeleicao +
                ", Partido=" + partido +
                ", Nome do Vice='" + nomeVice + '\'' +
                ", Partido do Vice=" + partidoVice + "}";
    }
}