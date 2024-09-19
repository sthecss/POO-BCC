public class Main {
    public static void main(String[] args) {
        Candidato[] candidatos = new Candidato[3];

        candidatos[0] = new Candidato("ALÉCIO DA COSTA PESSOA", "14/09/1983", "Masculino",
                "305.125,69", "Sim", 15, "Vice-prefeito");

        candidatos[1] = new Candidato("ANTONIO CARLOS DA SILVA LIMA", "05/12/1967", "Masculino",
                "73.000,00", "Não", 27, "Vice-prefeito");

        candidatos[2] = new Candidato("WALDOMERO JEFFERSON BALBINO DE ALENCAR", "22/01/1993", "Masculino",
                "810.000,00", "Não", 55555, "Prefeito");

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