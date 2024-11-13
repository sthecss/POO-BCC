import java.util.Scanner;
public class Empresa{
    public static void main(String args[]){
        Scanner x = new Scanner(System.in);

        Chefe[] chefes = new Chefe[2];
        Vendedor[] vendedores = new Vendedor[2];
        Operario[] operarios = new Operario[2];
        Horista[] horistas = new Horista[2];

        for(int i = 0; i < 2; i++){
            chefes[i] = new Chefe();
            vendedores[i] = new Vendedor();
            operarios[i] = new Operario();
            horistas[i] = new Horista();

            System.out.println();
            System.out.println("Digite o nome do chefe: ");
            chefes[i].nome = x.nextLine();
            System.out.println("Digite o data de nascimento do chefe: ");
            chefes[i].dataNas = x.nextLine();
            System.out.println("Digite os anos de experiência de trabalho do chefe: ");
            chefes[i].setExp(x.nextInt());
            System.out.println();
            x.nextLine();
            System.out.println("Digite o nome do vendedor: ");
            vendedores[i].nome = x.nextLine();
            System.out.println("Digite o data de nascimento do vendedor: ");
            vendedores[i].dataNas = x.nextLine();
            System.out.println("Digite a quantidade de vendas do vendedor: ");
            vendedores[i].setVendas(x.nextInt());
            System.out.println("Digite o valor da comissão do vendedor: ");
            vendedores[i].setComissao(x.nextDouble());
            vendedores[i].defSalario();
            System.out.println("Digite os anos de experiência de trabalho do vendedor: ");
            vendedores[i].setExp(x.nextInt());
            System.out.println();
            x.nextLine();
            System.out.println("Digite o nome do operário: ");
            operarios[i].nome = x.nextLine();
            System.out.println("Digite o data de nascimento do operário: ");
            operarios[i].dataNas = x.nextLine();
            System.out.println("Digite o valor de produção do operário: ");
            operarios[i].setValorProducao(x.nextDouble());
            System.out.println("Digite a quantidade produzida pelo operário: ");
            operarios[i].setQtdProducao(x.nextInt());
            operarios[i].defSalario();
            System.out.println("Digite os anos de experiência de trabalho do operário: ");
            operarios[i].setExp(x.nextInt());
            System.out.println();
            x.nextLine();
            System.out.println("Digite o nome do horista: ");
            horistas[i].nome = x.nextLine();
            System.out.println("Digite o data de nascimento do horista: ");
            horistas[i].dataNas = x.nextLine();
            System.out.println("Digite o quantidade de horas que o horista trabalha: ");
            horistas[i].setQtdHoras(x.nextInt());
            System.out.println("Digite o valor de cada hora de trabalho do horista: ");
            horistas[i].setValorHora(x.nextInt());
            vendedores[i].defSalario();
            System.out.println("Digite os anos de experiência de trabalho do horista: ");
            horistas[i].setExp(x.nextInt());
            x.nextLine();
        }

        for(int i = 0; i < 2; i++){
            chefes[i].mostrarInfosC();
            System.out.println();
            vendedores[i].mostrarInfosV();
            System.out.println();
            operarios[i].mostrarInfosO();
            System.out.println();
            horistas[i].mostrarInfosH();
        }
    }
}
