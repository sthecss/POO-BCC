public class Servico implements Classificavel{
    private double preco;

    public Servico(double preco){
        this.preco = preco;
    }

    public int menorQue(Classificavel q){
        Servico compara = (Servico) q;

        if(this.preco < compara.preco){
            return -1;
        }
        if(this.preco > compara.preco){
            return 1;
        }
        else{
            return 0;
        }
    }

    public void imprime() {
        System.out.println("Preço: " + preco);
    }
}
