public class C3 extends C2 {
    // ==================== ATRIBUTOS :
    public String atributoPublicoC3;
    protected String atributoProtegidoC3;
    private String atributoPrivadoC3;

    // ==================== CONSTRUTORES :
    public C3() {
        System.out.println("Classe C3: chamada do construtor padrão, sem parâmetros");
    }

    public C3(String publicoC1, String protegidoC1, String privadoC1,
              String publicoC2, String protegidoC2, String privadoC2,
              String publicoC3, String protegidoC3, String privadoC3) {
        super(publicoC1, protegidoC1, privadoC1, publicoC2, protegidoC2, privadoC2); // Chama o construtor de C2
        System.out.println("Classe C3: chamada do construtor com parâmetros");
        this.atributoPublicoC3 = publicoC3;
        this.atributoProtegidoC3 = protegidoC3;
        this.atributoPrivadoC3 = privadoC3;
    }

    // ==================== MÉTODOS :
    @Override
    public void mostrar_atributos() {
        super.mostrar_atributos();
        System.out.println("C3 - Atributo Público: " + atributoPublicoC3);
        System.out.println("C3 - Atributo Protegido: " + atributoProtegidoC3);
        System.out.println("C3 - Atributo Privado: " + atributoPrivadoC3);
    }

    @Override
    public void mostrar_atributos_super() {
        super.mostrar_atributos_super();
        System.out.println("C3 - Atributo Público: " + atributoPublicoC3);
        System.out.println("C3 - Atributo Protegido: " + atributoProtegidoC3);
        System.out.println("C3 - Atributo Privado: " + atributoPrivadoC3);
    }
}
