import static java.lang.Math.sqrt;

public class Tetraedro extends Tridimensional{
    public Tetraedro(String nome, double vt1){
        super(nome, vt1, 0,0);
    }

    public double getArea(){
        return area = (vt1 * vt1) * sqrt(3);
    }

    public double getVolume(){
        return volume = ((vt1 * vt1 *vt1) * sqrt(2)) / 12;
    }

    public void mostrarInfos(){
        super.mostrarInfos();
        System.out.println("- Área do Tetraedro   : " + getArea() + " cm²");
        System.out.println("- Volume do Tetraedro : " + getVolume() + " cm³");
        System.out.println("\n< A figura é um tetraedro, uma forma tridimensional. >");
    }
}
