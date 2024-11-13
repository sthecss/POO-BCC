public class Chefe extends Funcionario{
    private int exp;

    public Chefe(String nome, String dataNas, int exp){
        super(nome, dataNas, 20000);
        this.exp = exp;
    }

    public void mostrarInfos() {
        super.mostrarInfos();
        System.out.println("Anos de Experiência: " + exp);
    }
}
