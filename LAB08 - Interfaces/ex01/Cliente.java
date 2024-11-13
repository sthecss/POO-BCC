public class Cliente implements Classificavel{
    private String nome;

    public Cliente(String nome){
        this.nome = nome;
    }
    public boolean MenorQue(Classificavel p){
        Cliente compara = (Cliente) p;

        if(this.nome.compareTo(compara.nome) < 0){
            return true;
        }
        else{
            return false;
        }
    }

    public void imprime() {
        System.out.println("Nome: " + nome);
    }
}
