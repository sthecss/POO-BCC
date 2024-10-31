public class C2 extends C1 {
    // ==================== ATRIBUTOS :
    public String atributoPublicoC2;
    protected String atributoProtegidoC2;
    private String atributoPrivadoC2;

    // ==================== CONSTRUTORES :
    public C2() {
        System.out.println("Classe C2: chamada do construtor padrão, sem parâmetros");
    }

    public C2(String publicoC1, String protegidoC1, String privadoC1,
              String publicoC2, String protegidoC2, String privadoC2) {
        super(publicoC1, protegidoC1, privadoC1); // construtor de C1 com parâmetros
        System.out.println("Classe C2: chamada do construtor com parâmetros");
        this.atributoPublicoC2 = publicoC2;
        this.atributoProtegidoC2 = protegidoC2;
        this.atributoPrivadoC2 = privadoC2;
    }

    // ==================== DEMAIS MÉTODOS :
    @Override
    public void mostrar_atributos() {
        super.mostrar_atributos(); // aqui! nos usamos aquele método da superclasse (C1)
        System.out.println("C2 - Atributo Público: " + atributoPublicoC2);
        System.out.println("C2 - Atributo Protegido: " + atributoProtegidoC2);
        System.out.println("C2 - Atributo Privado: " + atributoPrivadoC2);
    }

    @Override
    public void mostrar_atributos_super() {
        super.mostrar_atributos_super(); // aqui! nos usamos aquele método da superclasse (C1)
        System.out.println("C2 - Atributo Público: " + atributoPublicoC2);
        System.out.println("C2 - Atributo Protegido: " + atributoProtegidoC2);
        System.out.println("C2 - Atributo Privado: " + atributoPrivadoC2);
    }
}
