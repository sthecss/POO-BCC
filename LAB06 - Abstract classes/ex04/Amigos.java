public class Amigos extends Contato{
    public int grau;

    public Amigos(String apelido, String nome, String email, String aniversario, int grau){
        super(apelido, nome, email, aniversario);
        this.grau = grau;
    }

    public void ImprimirContato(){
        super.ImprimirBasico();
        if(grau == 1){
            System.out.println("Grau de amizade: " + grau + " - Melhor amigo");
        }
        if(grau == 2){
            System.out.println("Grau de amizade: " + grau + " - Amigo");
        }
        if(grau == 3){
            System.out.println("Grau de amizade: " + grau + " - Conhecido");
        }
    }
}
