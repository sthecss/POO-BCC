public class Chefe extends Funcionario{
    private int exp;

    public void setExp(int exp) {
        this.exp = exp;
    }
    public int getExp() {
        return exp;
    }

    public Chefe(){
        super();
        super.salario = 20000;
        exp = 0;
    }

    public void mostrarInfosC() {
        super.mostrarInfos();
        System.out.println("Anos de Experiência: " + exp);
    }
}
