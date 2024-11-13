public class Servico implements Classificavel{
    private double preco;

    public Servico(double preco){
        this.preco = preco;
    }

    public boolean MenorQue(Classificavel q){
        Servico compara = (Servico) q;

        if(this.preco < compara.preco){
            return true;
        }
        else{
            return false;
        }
    }

    public void imprime() {
        System.out.println("Preço: " + preco);
    }
}
