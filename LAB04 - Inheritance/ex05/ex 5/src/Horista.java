public class Horista extends Funcionario{
    private int exp;
    private int valorHora;
    private int qtdHoras;

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

    public void setQtdHoras(int qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public Horista(){
        super();
        valorHora = 0;
        qtdHoras = 0;
        exp = 0;
    }

    public void defSalario(){
        super.salario = valorHora * qtdHoras;
    }

    public void mostrarInfosH(){
        super.mostrarInfos();
        System.out.println("Anos de Experiência: " + exp);
    }
}
