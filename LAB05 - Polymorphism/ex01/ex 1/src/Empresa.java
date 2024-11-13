public class Empresa{
    public static void main(String args[]){
        Funcionario[] funcionarios = new Funcionario[4];

        funcionarios[0] = new Chefe("Luis", "29/08/2000", 1);
        funcionarios[1] = new Vendedor("Clara", "08/05/1979", 15, 0.2,1000);
        funcionarios[2] = new Operario("Carlos", "10/07/1978", 20, 70, 50);
        funcionarios[3] = new Horista("Pedro", "14/10/2003", 1, 5, 400);

        for(Funcionario funcionario : funcionarios){
            funcionario.mostrarInfos();
            System.out.println();
        }

        FolhaDePagamento.mostrarFolhaPagamento(funcionarios);
    }
}
