public class VIP extends Ingresso{
    protected double valorAdd;

    public VIP(double valorAdd){
        this.valorAdd = valorAdd;

    }

    public double retornaVIP(){
        return valor + valorAdd;
    }
}
