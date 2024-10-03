public class Main {
    public static void main(String[] args) {

        exibirResumo();

        Ponto centro = new Ponto(2.0, 2.0);
        Circulo circulo = new Circulo(5.0, centro);

        System.out.println(circulo.toString());
    }

    public static void exibirResumo(){
        System.out.println("===================================");
        System.out.println("|        A S S O C I A C A O      |");
        System.out.println("===================================");
        System.out.println("| * Relacionamento fraco,         |");
        System.out.println("|   objetos independentes.        |");
        System.out.println("| * Exemplo: Círculo recebe dois  |");
        System.out.println("|   objetos Ponto.                |");
        System.out.println("| * Flexibilidade alta,           |");
        System.out.println("|   complexidade menor.           |");
        System.out.println("===================================");
    }
}