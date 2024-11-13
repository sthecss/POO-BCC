public class CamaroteSup extends VIP{

    private double valorAddCamSup;

    public CamaroteSup(double valorAddCamSup, double valorAdd){
        super(valorAdd);
        this.valorAddCamSup = valorAddCamSup;
    }

    public void imprimeCamSup(){
        System.out.println("Valor: " + (retornaVIP() + valorAddCamSup));
    }
}
