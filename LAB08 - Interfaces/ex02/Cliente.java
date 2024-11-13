public class Cliente implements Classificavel{
    private String nome;

    public Cliente(String nome){
        this.nome = nome;
    }
    public int menorQue(Classificavel p){
        Cliente compara = (Cliente) p;

        if(this.nome.compareTo(compara.nome) < 0){
            return -1;
        }
        if(this.nome.compareTo(compara.nome) > 0){
            return 1;
        }
        else{
            return 0;
        }
    }

    public void imprime() {
        System.out.println("Nome: " + nome);
    }
}
