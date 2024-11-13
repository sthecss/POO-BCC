public class CamaroteInf extends VIP{
    private String location;

    public CamaroteInf(String location, double valorAdd){
        super(valorAdd);
        this.location = location;
    }

    public void imprimeCamInf(){
        System.out.println("Localização: " + location);
        System.out.println("Valor: " + retornaVIP());
    }
}
