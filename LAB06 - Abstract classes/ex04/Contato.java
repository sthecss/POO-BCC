public abstract class Contato{
    protected String apelido;
    protected String nome;
    protected String email;
    protected String aniversario;

    public Contato(String apelido, String nome, String email, String aniversario){
        this.apelido = apelido;
        this.nome = nome;
        this.email = email;
        this.aniversario = aniversario;
    }

    public void ImprimirBasico(){
        System.out.println("Apelido: " + apelido);
        System.out.println("Nome: " + nome);
        System.out.println("E-mail: " + email);
        System.out.println("Aniversário: " + aniversario);
    }

    public abstract void ImprimirContato();
}
