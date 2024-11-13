public class Tridimensional extends Forma {
    public double vt1;
    public double vt2;
    public double vt3;
    public double volume;

    public Tridimensional(String nome, double vt1, double vt2, double vt3){
        super(nome);
        this.vt1 = vt1;
        this.vt2 = vt2;
        this.vt3 = vt3;
    }

    public double getVolume(){
        return volume;
    }
}
