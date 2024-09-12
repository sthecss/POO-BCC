public class Candidato {
    String nomeCompleto;
    String dataNascimento;
    String sexo;
    String totalBens;
    String reeleicao;
    int partido;
    String cargoPretendido;

    // Método para exibir as informações do candidato
    public void exibirInformacoes() {
        System.out.println("Nome Completo: " + nomeCompleto);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Sexo: " + sexo);
        System.out.println("Total de Bens: R$" + totalBens);
        System.out.println("Candidato à Reeleição: " + reeleicao);
        System.out.println("Número do Partido: " + partido);
        System.out.println("Cargo Pretendido: " + cargoPretendido);
        System.out.println("--------------------------------------");
    }
}