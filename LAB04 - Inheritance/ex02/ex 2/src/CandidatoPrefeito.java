public class CandidatoPrefeito extends Candidato {
    // ==================== ATRIBUTOS ESPECÍFICOS :
    private String nomeVice;
    private int partidoVice;


    // ==================== CONSTRUTOR :
    public CandidatoPrefeito(String nomeCompleto, String dataNascimento, String sexo, String totalBens,
                             Boolean reeleicao, int partido, String nomeVice, int partidoVice) {
        super(nomeCompleto, dataNascimento, sexo, totalBens, reeleicao, partido); // Chama o construtor da superclasse
        this.nomeVice = nomeVice;
        this.partidoVice = partidoVice;
    }


    // ==================== DEMAIS METODOS :
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
