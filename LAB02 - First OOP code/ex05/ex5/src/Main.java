public class Main {
    public static void main(String[] args) {
        // Minha cidade:
        Candidato[] candidatosFloresta = new Candidato[2];
        candidatosFloresta[0] = new Candidato("ALÉCIO DA COSTA PESSOA", "14/09/1983", "Masculino",
                "305.125,69", "Sim", 15, "Vice-prefeito");
        candidatosFloresta[1] = new Candidato("ANTONIO CARLOS DA SILVA LIMA", "05/12/1967", "Masculino",
                "73.000,00", "Não", 27, "Vice-prefeito");

        // Cidade Extra:
        Candidato[] candidatosCajueiro = new Candidato[2];
        candidatosCajueiro[0] = new Candidato("CARLOS EDUARDO GOMES", "10/05/1980", "Masculino",
                "600.000,00", "Sim", 40, "Prefeito");
        candidatosCajueiro[1] = new Candidato("MÁRCIA CRUZ DE ALMEIDA", "12/07/1975", "Feminino",
                "150.000,00", "Não", 45, "Vice-prefeita");

        // Criando as eleições
        Eleicao eleicaoFloresta = new Eleicao("Floresta do Araguaia", 12000, "15/11/2024", candidatosFloresta);
        Eleicao eleicaoTucurui = new Eleicao("Tucuruí", 35000, "15/11/2024", candidatosCajueiro);

        // Exibindo as informações das eleições
        System.out.println("Informações da Eleição em Floresta do Araguaia:");
        eleicaoFloresta.exibirInformacoesEleicao();

        System.out.println("\nInformações da Eleição em Tucuruí:");
        eleicaoTucurui.exibirInformacoesEleicao();
    }
}