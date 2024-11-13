public class Trabalho extends Contato{
    public String tipo;

    public Trabalho(String apelido, String nome, String email, String aniversario, String tipo){
        super(apelido, nome, email, aniversario);
        this.tipo = tipo;
    }

    public void ImprimirContato(){
        super.ImprimirBasico();
        System.out.println("Tipo de contato: " + tipo);
    }
}
