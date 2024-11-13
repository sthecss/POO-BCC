public class Vendedor extends Funcionario{
    private int exp;
    private double comissao;
    private int vendas;

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public Vendedor(){
        super();
        super.salario = 5000;
        comissao = 0;
        vendas = 0;
        exp = 0;
    }

    public void defSalario(){
        super.salario += (int) (comissao * vendas);
    }

    public void mostrarInfosV() {
        super.mostrarInfos();
        System.out.println("Anos de Experiência: " + exp);
    }
}
