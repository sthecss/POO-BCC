public class Main {
    public static void main(String[] args) {
        // Criando os 5 candidatos para a eleição
        Candidato[] candidatos = new Candidato[5];
        candidatos[0] = new Candidato("THIAGO SANCHES FLORES PINTO", "25/07/1978", "Masculino",
                375000.00, "Nao", 44, "Prefeito");
        candidatos[1] = new Candidato("MAJORRI CERQUEIRA DA SILVA AQUINO SANTIAGO", "10/12/1987", "Feminino",
                1420000.00, "Sim", 15, "Prefeita");
        candidatos[2] = new Candidato("WALDOMERO JEFFERSON BALBINO DE ALENCAR", "22/01/1993", "Masculino",
                810000.00, "Não", 27, "Prefeito");
        candidatos[3] = new Candidato("ALÉCIO DA COSTA PESSOA", "14/09/1983", "Masculino",
                305125.00, "Sim", 15, "Vice_prefeito");
        candidatos[4] = new Candidato("ANTONIO CARLOS DA SILVA LIMA", "05/12/1967", "Masculino",
                73000.00, "Nao", 27, "Vice-prefeito");

        // Criando a eleição
        Eleicao eleicao = new Eleicao("Floresta do Araguaia", 12000, "15/11/2024", candidatos);

        // Exibindo informações da cidade referente ao código
        System.out.println("\nInformações da Cidade dos Candidatos:");
        System.out.println("----------------------------------------------");
        System.out.println("Matrícula: 12211bcc044");
        System.out.println("Código: [044]");
        System.out.println("Cidade: Floresta do Araguaia/PA - Código: 1503044");
        System.out.println("----------------------------------------------");


        // Exibindo informações da eleição
        System.out.println("Informações da Eleição:");
        eleicao.exibirInformacoesEleicao();

        // Buscando o candidato com o maior valor de bens
        Candidato candidatoMaiorBens = eleicao.buscarCandidatoMaiorBens();
        System.out.println("\nCandidato com o maior valor de bens:");
        candidatoMaiorBens.exibirInformacoes();

        // Calculando o percentual de bens do maior candidato em relação ao total
        double percentualBens = eleicao.calcularPercentualBens(candidatoMaiorBens);
        System.out.printf("Percentual de bens em relação ao total: %.2f%%\n", percentualBens);
    }
}