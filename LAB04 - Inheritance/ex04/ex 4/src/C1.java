public class C1 {
    // ==================== ATRIBUTOS :
    public String atributoPublicoC1;
    protected String atributoProtegidoC1;
    private String atributoPrivadoC1;

    // ==================== CONSTRUTORES :
    public C1() {
        System.out.println("Classe C1: chamada do construtor padrão, sem parâmetros");
    }

    public C1(String publico, String protegido, String privado) {
        System.out.println("Classe C1: chamada do construtor com parâmetros");
        this.atributoPublicoC1 = publico;
        this.atributoProtegidoC1 = protegido;
        this.atributoPrivadoC1 = privado;
    }

    // ==================== DEMAIS MÉTODOS :
    public void mostrar_atributos() {
        System.out.println("C1 - Atributo Público: " + atributoPublicoC1);
        System.out.println("C1 - Atributo Protegido: " + atributoProtegidoC1);
        System.out.println("C1 - Atributo Privado: " + atributoPrivadoC1);
    }

    public void mostrar_atributos_super() {
        // C1 não tem super, já que é a classe mais ao topo, anetao ela imprime os próprios atributos
        // MAS, nao vamos subestimar o poder desse metodo, ele ira ajudar na classe C2!
        mostrar_atributos();
    }
}
