public class Main {
    public static void main(String[] args) {
        // Cria objetos para testar a herança e os construtores
        System.out.println("Teste 1: C1 sem parâmetros");
        C1 c1 = new C1();
        c1.mostrar_atributos();
        System.out.println();

        System.out.println("Teste 2: C2 com parâmetros");
        C2 c2 = new C2("PublicoC1", "ProtegidoC1", "PrivadoC1", "PublicoC2", "ProtegidoC2", "PrivadoC2");
        c2.mostrar_atributos();
        System.out.println();

        System.out.println("Teste 3: C3 com parâmetros");
        C3 c3 = new C3("PublicoC1", "ProtegidoC1", "PrivadoC1", "PublicoC2", "ProtegidoC2", "PrivadoC2",
                "PublicoC3", "ProtegidoC3", "PrivadoC3");
        c3.mostrar_atributos();
        System.out.println();

        System.out.println("Teste 4: C3 com super.toString()");
        c3.mostrar_atributos_super();
    }
}