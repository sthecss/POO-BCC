public class Esfera extends Tridimensional {
    public Esfera(String nome, double vt1){
        super(nome, vt1, 0, 0);
    }

    public double getArea(){
        return area = 4 * 3.14 * (vt1 * vt1);
    }

    public double getVolume(){
        return volume = ((double) 4 /3) * 3.14 * (vt1 * vt1 * vt1);
    }

    public void mostrarInfos(){
        super.mostrarInfos();
        System.out.println("- Área da Esfera   : " + getArea() + " cm²");
        System.out.println("- Volume da Esfera : " + getVolume() + " cm³");
        System.out.println("\n< A figura é uma esfera, uma forma tridimensional. >");
    }
}
