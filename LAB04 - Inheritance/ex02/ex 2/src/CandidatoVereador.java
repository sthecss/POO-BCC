public class CandidatoVereador extends Candidato {
    // ==================== ATRIBUTOS ESPECÍFICOS :
    private String numeroVereador;
    private String bairro;


    // ==================== CONSTRUTOR :
    public CandidatoVereador(String nomeCompleto, String dataNascimento, String sexo, String totalBens,
                             Boolean reeleicao, int partido, String numeroVereador, String bairro) {
        super(nomeCompleto, dataNascimento, sexo, totalBens, reeleicao, partido); // Chama o construtor da superclasse
        this.numeroVereador = numeroVereador;
        this.bairro = bairro;
    }


    // ==================== DEMAIS METODOS :
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
