import java.util.ArrayList;
import java.util.List;

public class ListEstudante {
    public static void main(String[] args) {
        List<Estudante> listaDeEstudantes = new ArrayList<>();

        listaDeEstudantes.add(new Estudante("João", "R. 1"));
        listaDeEstudantes.add(new EstudantePosGrad("Maria", "R. 2", "Comp.", "IA"));
        listaDeEstudantes.add(new EstudanteGraduacao("Pedro", "R. 3", "Cybersecurity"));

        System.out.println("Lista de Estudantes:");
        for (Estudante estudante : listaDeEstudantes) {
            if(estudante instanceof EstudanteGraduacao){
                estudante.print();
            }
            if(estudante instanceof EstudantePosGrad){
                estudante.print();
            }
            else{
                estudante.print();
            }
            System.out.println("\n");
        }
    }
}
