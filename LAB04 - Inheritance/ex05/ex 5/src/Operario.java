public class Operario extends Funcionario{
    private int exp;
    private double valorProducao;
    private int qtdProducao;

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public void setQtdProducao(int qtdProducao) {
        this.qtdProducao = qtdProducao;
    }

    public Operario(){
        super();
        valorProducao = 0;
        qtdProducao = 0;
        exp = 0;
    }

    public void defSalario(){
        super.salario = (int) (valorProducao * qtdProducao);
    }

    public void mostrarInfosO(){
        super.mostrarInfos();
        System.out.println("Anos de Experiência: " + exp);
    }
}
