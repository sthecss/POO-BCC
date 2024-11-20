import java.util.List;
import java.util.stream.Collectors;

public class ServicoAtualizacao {

    public static void cadastroGeralCRA(String diretorio) {
        try {
            List<Estudante> estudantes = Persistencia.carregarLista(diretorio + "/_estudantes.bin", "estudantes");
            List<Matricula> matriculas = Persistencia.carregarLista(diretorio + "/_matriculas.bin", "matrículas");

            for (Estudante estudante : estudantes) {
                atualizarCRA(estudante, matriculas);
            }

            Persistencia.salvar(diretorio + "/_estudantes.bin", estudantes);
            System.out.println("Atualização de CRA concluída com sucesso.");

        } catch (ErroArgumentoException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }

    private static void atualizarCRA(Estudante estudante, List<Matricula> matriculas) {
        List<Matricula> matriculasDoEstudante = matriculas.stream()
                .filter(m -> m.getAluno().getCodMatricula().equals(estudante.getCodMatricula()))
                .collect(Collectors.toList());

        if (matriculasDoEstudante.isEmpty()) {
            System.out.println("Estudante " + estudante.getNome() + " não possui matrículas. CRA não atualizado.");
            return;
        }

        double somaNotas = matriculasDoEstudante.stream()
                .mapToDouble(Matricula::getNota)
                .sum();
        double mediaNotas = somaNotas / matriculasDoEstudante.size();
        mediaNotas = Math.round(mediaNotas * 100.0) / 100.0; // Arredondar para 2 casas decimais

        estudante.setCra(mediaNotas);
        System.out.println("CRA do estudante " + estudante.getNome() + " atualizado para: " + mediaNotas);
    }
}
