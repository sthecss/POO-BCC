import static java.lang.Math.sqrt;

public class Triangulo extends Bidimensional{
    protected double vb3;

    public Triangulo(String nome, double vb1, double vb2, double vb3){
        super(nome, vb1, vb2);
        this.vb3 = vb3;
    }

    public double getArea(){
        double x = (vb1 + vb2 + vb3) / 2;
        return area = sqrt(x * (x - vb1) * (x - vb2) * (x - vb3));
    }

    public void mostrarInfos(){
        super.mostrarInfos();
        System.out.println("Área do Triângulo: " + getArea() + " cm²");
        System.out.println("\n< A figura é um triângulo bidimensional." + " Por isso, o volume dessa figura é 0! >");
    }
}
