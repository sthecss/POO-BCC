public class Circulo extends Bidimensional{
    public Circulo(String nome, double vb1){
        super(nome, vb1, 0);
    }

    public double getArea(){
        return area = (vb1 * vb1) * 3.14;
    }

    public void mostrarInfos(){
        super.mostrarInfos();
        System.out.println("- Área do Círculo: " + getArea() + " cm²");
        System.out.println("\n< Essa figura é um círculo bidimensional." + " Por isso, o volume dessa figura é 0! >");
    }
}
