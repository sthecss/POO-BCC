public class Quadrado extends Bidimensional{
    public Quadrado(String nome, double vb1){
        super(nome, vb1, 0);
    }

    public double getArea(){
        return area = vb1 * vb1;
    }

    public void mostrarInfos(){
        super.mostrarInfos();
        System.out.println("- Área do Quadrado: " + getArea() + " cm²");
        System.out.println("\n < A figura é um quadrado bidimensional." + " Por isso, o volume dessa figura é 0! >");
    }
}
