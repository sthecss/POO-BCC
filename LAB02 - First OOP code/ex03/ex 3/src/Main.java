public class Main {
    public static void main(String[] args) {
        Candidato[] candidatos = new Candidato[3];

        for (int x = 0; x < candidatos.length; x++) {
            candidatos[x] = new Candidato();
        }

        candidatos[0].setNomeCompleto("ALÉCIO DA COSTA PESSOA");
        candidatos[0].setDataNascimento("14/09/1983");
        candidatos[0].setSexo("Masculino");
        candidatos[0].setTotalBens("305.125,69");
        candidatos[0].setReeleicao("Sim");
        candidatos[0].setPartido(15);
        candidatos[0].setCargoPretendido("Vice-prefeito");

        candidatos[1].setNomeCompleto("ANTONIO CARLOS DA SILVA LIMA");
        candidatos[1].setDataNascimento("05/12/1967");
        candidatos[1].setSexo("Masculino");
        candidatos[1].setTotalBens("73.000,00");
        candidatos[1].setReeleicao("Não");
        candidatos[1].setPartido(27);
        candidatos[1].setCargoPretendido("Vice-prefeito");

        candidatos[2].setNomeCompleto("WALDOMERO JEFFERSON BALBINO DE ALENCAR");
        candidatos[2].setDataNascimento("22/01/1993");
        candidatos[2].setSexo("Masculino");
        candidatos[2].setTotalBens("810.000,00");
        candidatos[2].setReeleicao("Não");
        candidatos[2].setPartido(55555);
        candidatos[2].setCargoPretendido("Prefeito");

        // Exibindo informações da cidade referente ao código
        System.out.println("\nInformações da Cidade dos Candidatos:");
        System.out.println("----------------------------------------------");
        System.out.println("Matrícula: 12211bcc044");
        System.out.println("Código: [044]");
        System.out.println("Cidade: Floresta do Araguaia/PA - Código: 1503044");
        System.out.println("----------------------------------------------");

        // Exibindo informações dos candidatos
        System.out.println("\nInformações dos candidatos:");

        for (Candidato candidato : candidatos) {
            candidato.exibirInformacoes();
        }
    }
}