public class Cubo extends Tridimensional {
    public Cubo(String nome, double vt1){
        super(nome, vt1, 0, 0);
    }

    public double getArea() {
        return area = 6 * (vt1 * vt1);
    }

    public double getVolume() {
        return volume = (vt1 * vt1 * vt1);
    }

    public void mostrarInfos() {
        super.mostrarInfos();
        System.out.println("- Área do Cubo: " + getArea() + " cm²");
        System.out.println("- Volume do Cubo: " + getVolume() + " cm³");
        System.out.println("\n< A figura é um cubo, uma forma tridimensional. >");
    }
}
