public class Funcionario {
    private String nome;
    private String CPF;
    private double salario;
    private double tetoSalarial;

    public Funcionario(String nome, String CPF, double salario){
        this.nome = nome;
        this.CPF = CPF;
        this.salario = salario;
        this.tetoSalarial = 40000;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setTetoSalarial(double tetoSalarial) {
        this.tetoSalarial = tetoSalarial;
    }

    public double getTetoSalarial() {
        return tetoSalarial;
    }

    public void aumentaSalario(double porcentagem){
        double salarioTemp = salario * (1 + (porcentagem / 100));

        if(salarioTemp <= 0){
            throw new SalarioInvalidoException("Aumento inválido!");
        }
        else if(salarioTemp > tetoSalarial){
            throw new SalarioInvalidoException("Aumento ultrapassa o teto!");
        }
        else{
            salario = salarioTemp;
        }
    }
}
