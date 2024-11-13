import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner x = new Scanner(System.in);
        Funcionario funcionario = new Funcionario("Arthur", "173.418.436-16", 30000);

        try {
            funcionario.aumentaSalario(2);
        } catch (SalarioInvalidoException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Salário R$: " + funcionario.getSalario() + "\n");
        }

        System.out.println("Deseja exibir a resposta do exercício 2? (True or False)");
        boolean r = x.nextBoolean();
        System.out.println();

        if(r) {
            System.out.println("Throw: ");
            System.out.println("O throw é uma palavra-chave usada para lançar uma exceção.\n" +
                    "O throw é usado dentro do corpo de um método para sinalizar que ocorreu um problema e uma exceção específica que deve ser lançada.\n" +
                    "Por exemplo: 'throw new MinhaExcecao();', indica que uma instância da classe MinhaExcecao está sendo lançada.\n");

            System.out.println("Throws: ");
            System.out.println("Já o throws é uma declaração que aparece na assinatura do método.\n" +
                    "Indica que o método pode lançar uma exceção particular, mas não lida com ela internamente.\n" +
                    "Quando um método declara que ele throws uma exceção, ele está indicando que as chamadas para esse método devem " +
                    "estar preparadas para lidar com essa exceção (ou declarar que também podem lançar a mesma exceção).\n" +
                    "Por exemplo: 'public void meuMetodo() throws MinhaExcecao { ... }', indica que o método pode lançar uma exceção do tipo MinhaExcecao.\n");

            System.out.println("Checked: ");
            System.out.println("São exceções que o compilador obriga o programador a lidar de alguma forma (usando try-catch ou declarando no método com throws).\n" +
                    "Geralmente, são condições que podem ocorrer fora do controle do programa (ex.: leitura de arquivo, operações de entrada e saída).\n" +
                    "São subclasses de Exception (não incluindo RuntimeException e suas subclasses).\n");

            System.out.println("Unchecked: ");
            System.out.println("São exceções que o compilador não obriga o programador a lidar explicitamente.\n" +
                    "Normalmente representam bugs no código (ex.: NullPointerException, ArrayIndexOutOfBoundsException).\n" +
                    "São subclasses de RuntimeException e suas subclasses.\n" +
                    "Podem ocorrer em tempo de execução e geralmente resultam de erros de programação.\n");
        }
        else if(!r){
            System.out.println("Laboratório finalizado!");
        }
    }
}
