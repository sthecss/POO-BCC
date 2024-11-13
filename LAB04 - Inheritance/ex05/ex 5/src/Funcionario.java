public class Funcionario{
    protected String nome;
    protected String dataNas;
    protected int salario;

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

    public Funcionario(){
        nome = "null";
        dataNas = "null";
        salario = 0;
    }

    public void mostrarInfos(){
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNas);
        System.out.println("Salário: " + salario);
    }
}
