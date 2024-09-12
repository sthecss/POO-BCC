public class Main {
    public static void main(String[] args) {
        Candidato candidato1 = new Candidato();
        Candidato candidato2 = new Candidato();
        Candidato candidato3 = new Candidato();

        candidato1.setNomeCompleto("ALÉCIO DA COSTA PESSOA");
        candidato1.setDataNascimento("14/09/1983");
        candidato1.setSexo("Masculino");
        candidato1.setTotalBens("305.125,69");
        candidato1.setReeleicao("Sim");
        candidato1.setPartido(15);
        candidato1.setCargoPretendido("Vice-prefeito");

        candidato2.setNomeCompleto("ANTONIO CARLOS DA SILVA LIMA");
        candidato2.setDataNascimento("05/12/1967");
        candidato2.setSexo("Masculino");
        candidato2.setTotalBens("73.000,00");
        candidato2.setReeleicao("Não");
        candidato2.setPartido(27);
        candidato2.setCargoPretendido("Vice-prefeito");

        candidato3.setNomeCompleto("WALDOMERO JEFFERSON BALBINO DE ALENCAR");
        candidato3.setDataNascimento("22/01/1993");
        candidato3.setSexo("Masculino");
        candidato3.setTotalBens("810.000,00");
        candidato3.setReeleicao("Não");
        candidato3.setPartido(55555);
        candidato3.setCargoPretendido("Prefeito");

        // Exibindo informações da cidade referente ao código
        System.out.println("\nInformações da Cidade dos Candidatos:");
        System.out.println("----------------------------------------------");
        System.out.println("Matrícula: 12211bcc044");
        System.out.println("Código: [044]");
        System.out.println("Cidade: Floresta do Araguaia/PA - Código: 1503044");
        System.out.println("----------------------------------------------");

        // Exibindo informações dos candidatos
        System.out.println("\nInformações dos candidatos:");
        candidato1.exibirInformacoes();
        candidato2.exibirInformacoes();
        candidato3.exibirInformacoes();
    }
}
