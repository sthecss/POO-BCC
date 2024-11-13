public class Main {
    public static void main(String args[]){
        Universidade universidade = new Universidade("UFU", "19/02/1958");

        universidade.Graduacao("A", "A", "A");
        universidade.Mestrado("B", "B", "B", "B", "B", "B");
        universidade.Doutorado("C", "C", "C", "C", "C");

        universidade.mostrarAlunos();
        System.out.println("\n");

        universidade.quantEstudantes();
    }
}
