public class Main {
    public static void main(String[] args) {

        CandidatoPrefeito prefeito = new CandidatoPrefeito(
                "João Silva", "01/01/1970", "Masculino", "500000",
                true, 45, "Maria Souza", 20);

        Candidato candidato = new Candidato(
                "Carlos Pereira", "10/10/1980", "Masculino", "100000", false, 33);

        CandidatoVereador vereador = new CandidatoVereador(candidato, "123", "Centro");

        System.out.println(prefeito.toString());
        System.out.println(vereador.toString());
    }
}