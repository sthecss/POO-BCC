public class Main {
    public static void main(String[] args) {

        exibirResumo();

        System.out.println("-> Construtor Um: Quando passamos apenas o raio");
        Circulo circuloUm = new Circulo(5.0);
        System.out.println(circuloUm.toString());

        System.out.println("-> Construtor Dois: Quando passamos o raio e um ponto previamente cadastrado.");
        Ponto pontoDois = new Ponto(2.0,2.0);
        Circulo circuloDois = new Circulo(5.0, pontoDois);
        System.out.println(circuloDois.toString());

        System.out.println("-> Construtor Tres: Passando um raio, um x e um y.");
        Circulo circuloTres = new Circulo (5.0,2.0,2.0);
        System.out.println(circuloTres.toString());

    }

    public static void exibirResumo(){
        System.out.println("===================================");
        System.out.println("|      C O M P O S I C A O        |");
        System.out.println("===================================");
        System.out.println("| * Relacionamento muito forte,   |");
        System.out.println("|   componentes dependem do       |");
        System.out.println("|   composto.                     |");
        System.out.println("| * Exemplo: Círculo cria         |");
        System.out.println("|   instâncias de Ponto           |");
        System.out.println("|   internamente.                 |");
        System.out.println("| * Flexibilidade baixa,          |");
        System.out.println("|   complexidade média.           |");
        System.out.println("===================================");
    }
}