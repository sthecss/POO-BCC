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

    // ==================== toString :
    @Override
    public String toString() {
        return super.toString() + // Usa o toString da superclasse para acessar os atributos privados
                ", Nome do Vice='" + nomeVice + '\'' +
                ", Partido do Vice=" + partidoVice + "}";
    }
}
