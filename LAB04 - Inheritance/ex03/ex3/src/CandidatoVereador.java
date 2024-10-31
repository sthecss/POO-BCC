public class CandidatoVereador extends Candidato {
    // ==================== ATRIBUTOS ESPECÍFICOS :
    private String numeroVereador;
    private String bairro;

    // ==================== CONSTRUTORES :
    public CandidatoVereador(String nomeCompleto, String dataNascimento, String sexo, String totalBens,
                             Boolean reeleicao, int partido, String numeroVereador, String bairro) {
        super(nomeCompleto, dataNascimento, sexo, totalBens, reeleicao, partido); // Chama o construtor da superclasse
        this.numeroVereador = numeroVereador;
        this.bairro = bairro;
    }

    // Construtor que recebe um objeto Candidato e os atributos específicos de Vereador
    public CandidatoVereador(Candidato candidato, String numeroVereador, String bairro) {
        super(candidato.getNomeCompleto(), candidato.getDataNascimento(), candidato.getSexo(),
                candidato.getTotalBens(), candidato.getReeleicao(), candidato.getPartido());
        this.numeroVereador = numeroVereador;
        this.bairro = bairro;
    }

    // ==================== toString :
    @Override
    public String toString() {
        return super.toString() + // Usa o toString da superclasse para acessar os atributos privados
                ", Número='" + numeroVereador + '\'' +
                ", Bairro='" + bairro + '\'' + "}";
    }
}
