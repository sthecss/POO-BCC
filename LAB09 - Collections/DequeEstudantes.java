import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class DequeEstudantes {
    public static void main(String[] args) {
        Deque<Estudante> dequeEstudantes = new ArrayDeque<>();

        dequeEstudantes.add(new Estudante("João", "R. 1"));
        dequeEstudantes.add(new EstudanteGraduacao("Maria", "R. 2", "Cybersecurity"));
        dequeEstudantes.add(new EstudantePosGrad("Pedro", "R. 3", "Comp.", "IA"));

        exibirPrimeiroEstudante(dequeEstudantes);
        exibirUltimoEstudante(dequeEstudantes);

        try {
            removerPrimeiroEstudante(dequeEstudantes);
        } catch (NoSuchElementException e) {
            System.out.println("Erro: Deque vazio, não é possível remover o primeiro estudante.");
        }
    }

    private static void exibirPrimeiroEstudante(Deque<Estudante> deque) {
        System.out.println("Primeiro Estudante: " + deque.getFirst());
    }

    private static void exibirUltimoEstudante(Deque<Estudante> deque) {
        System.out.println("Último Estudante: " + deque.getLast());
    }

    private static void removerPrimeiroEstudante(Deque<Estudante> deque) {
        deque.removeFirst();
        System.out.println("Remoção do primeiro estudante concluída.");
    }
}
