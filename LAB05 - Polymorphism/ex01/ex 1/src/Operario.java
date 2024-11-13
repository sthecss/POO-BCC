public class Operario extends Funcionario{
    private int exp;
    private double valorProducao;
    private int qtdProducao;

    public Operario(String nome, String dataNas, int exp, double valorProducao, int qtdProducao){
        super(nome, dataNas, 0);
        this.valorProducao = valorProducao;
        this.qtdProducao = qtdProducao;
        this.exp = exp;
    }

    public int calcSalario(){
        return (int) valorProducao * qtdProducao;
    }

    public void mostrarInfos(){
        super.mostrarInfos();
        System.out.println("Anos de Experiência: " + exp);
    }
}
