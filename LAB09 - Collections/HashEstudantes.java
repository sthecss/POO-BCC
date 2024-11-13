import java.util.HashMap;
import java.util.Map;

public class HashEstudantes {
    public static void main(String[] args) {
        Map<String, Estudante> conjuntoDeEstudantes = new HashMap<>();

        conjuntoDeEstudantes.put("A", new Estudante("João", "R. 1"));
        conjuntoDeEstudantes.put("B", new EstudantePosGrad("Maria", "R. 2", "Comp.", "IA"));
        conjuntoDeEstudantes.put("C", new EstudanteGraduacao("Pedro", "R. 3", "Cybersecurity"));

        System.out.println("Conjunto de Estudantes:");
        for (Map.Entry<String, Estudante> entry : conjuntoDeEstudantes.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
