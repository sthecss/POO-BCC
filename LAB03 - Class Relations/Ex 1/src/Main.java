public class Main {
    public static void main(String[] args) {

        exibirResumo();

        Ponto centro = new Ponto (2.4,2.5);
        Circulo circulo = new Circulo();

        circulo.setCentro(centro);
        circulo.setRaio(5.0);

        System.out.println(circulo.toString());
    }

    public static void exibirResumo(){
        System.out.println("===================================");
        System.out.println("|       A g r e g a ç ã o         |");
        System.out.println("===================================");
        System.out.println("| * Relacionamento forte,         |");
        System.out.println("|   objeto composto pode existir  |");
        System.out.println("|   sem componentes.              |");
        System.out.println("| * Exemplo: Círculo recebe       |");
        System.out.println("|   pontos via métodos setCentro  |");
        System.out.println("|   e setRaio.                    |");
        System.out.println("| * Flexibilidade média,          |");
        System.out.println("|   complexidade maior.           |");
        System.out.println("===================================");
    }
}