public class Produto implements Classificavel{
    private int codigo;

    public Produto(int codigo){
        this.codigo = codigo;
    }
    public int menorQue(Classificavel o){
        Produto compara = (Produto) o;

        if(this.codigo < compara.codigo){
            return -1;
        }
        if(this.codigo > compara.codigo){
            return 1;
        }
        else{
            return 0;
        }
    }

    public void imprime() {
        System.out.println("Código: " + codigo);
    }
}

