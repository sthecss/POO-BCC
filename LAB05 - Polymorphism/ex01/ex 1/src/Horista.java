public class Horista extends Funcionario{
    private int exp;
    private int valorHora;
    private int qtdHoras;

    public Horista(String nome, String dataNas, int exp, int valorHora, int qtdHoras){
        super(nome, dataNas, 0);
        this.valorHora = valorHora;
        this.qtdHoras = qtdHoras;
        this.exp = exp;
    }

    public int calcSalario(){
        return valorHora * qtdHoras;
    }

    public void mostrarInfos(){
        super.mostrarInfos();
        System.out.println("Anos de Experiência: " + exp);
    }
}
