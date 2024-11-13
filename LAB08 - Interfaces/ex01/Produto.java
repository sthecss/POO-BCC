public class Produto implements Classificavel{
    private int codigo;

    public Produto(int codigo){
        this.codigo = codigo;
    }
    public boolean MenorQue(Classificavel o){
        Produto compara = (Produto) o;

        if(this.codigo < compara.codigo){
            return true;
        }
        else{
            return false;
        }
    }

    public void imprime() {
        System.out.println("Código: " + codigo);
    }
}
