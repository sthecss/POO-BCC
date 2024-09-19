class Eleicao {
    private String municipio;
    private int numeroVotantes;
    private String dataEleicao;
    private Candidato[] candidatos;

    // Construtor
    public Eleicao(String municipio, int numeroVotantes, String dataEleicao, Candidato[] candidatos) {
        this.municipio = municipio;
        this.numeroVotantes = numeroVotantes;
        this.dataEleicao = dataEleicao;
        this.candidatos = candidatos;
    }

    // Método para exibir as informações da eleição
    public void exibirInformacoesEleicao() {
        System.out.println("Município: " + municipio);
        System.out.println("Número de Votantes: " + numeroVotantes);
        System.out.println("Data da Eleição: " + dataEleicao);
        System.out.println("\nCandidatos:");
        for (Candidato candidato : candidatos) {
            candidato.exibirInformacoes();
        }
    }
}