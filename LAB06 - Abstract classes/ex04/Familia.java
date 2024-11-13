public class Familia extends Contato{
    public String parentesco;

    public Familia(String apelido, String nome, String email, String aniversario, String parentesco){
        super(apelido, nome, email, aniversario);
        this.parentesco = parentesco;
    }

    public void ImprimirContato(){
        super.ImprimirBasico();
        System.out.println("Parentesco: " + parentesco);
    }



}
