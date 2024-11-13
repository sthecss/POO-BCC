public class Funcionario{
    private String nome;
    private String dataNas;
    private int salario;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDataNas(String dataNas) {
        this.dataNas = dataNas;
    }

    public String getDataNas() {
        return dataNas;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public Funcionario(String nome, String dataNas, int salario){
        this.nome = nome;
        this.dataNas = dataNas;
        this.salario = salario;
    }

    public int calcSalario(){
        return salario;
    }

    public void mostrarInfos(){
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNas);
        System.out.println("Salário: " + calcSalario());
    }
}
