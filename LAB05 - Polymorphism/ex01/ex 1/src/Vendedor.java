public class Vendedor extends Funcionario{
    private int exp;
    private double comissao;
    private int vendas;

    public Vendedor(String nome, String dataNas, int exp, double comissao, int vendas){
        super(nome, dataNas, 5000);
        this.comissao = comissao;
        this.vendas = vendas;
        this.exp = exp;
    }

    public int calcSalario(){
        return (int) (getSalario() + (comissao * vendas));
    }

    public void mostrarInfos() {
        super.mostrarInfos();
        System.out.println("Anos de Experiência: " + exp);
    }
}
