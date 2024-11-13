public class FolhaDePagamento{
    public static void mostrarFolhaPagamento(Funcionario[] funcionarios) {
        System.out.println("Folha de Pagamento:");

        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome() + " --" + " Salário: " + funcionario.calcSalario());
        }
    }
}
