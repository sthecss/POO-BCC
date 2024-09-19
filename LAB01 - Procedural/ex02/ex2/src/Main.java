import java.util.Scanner;

public class Main {

    // Função altera_preco
    // Desc: modifica o preço de um *produto*
    // Entrada:
    //    preco: preço do produto
    //    porcentagem: valor percentual a ser alterado, podendo
    //    ser negativo para diminuir valores
    // Retorno:
    //    true - sucesso
    //    false - erro
    public static boolean alteraPreco(float[] preco, int indice, float porcentagem) {
        if (porcentagem > -100) {
            float temp = 1 + porcentagem / 100;  // Exemplo: 10% >>> 1 + 10/100 = 1.1 ;; -5% => 1 + (-5/100) = 0.95
            preco[indice] = preco[indice] * temp;  // preço modificado
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nome = new String[4];
        float[] preco = new float[4];
        int[] qtdEstoque = new int[4];

        // Leitura de dados
        for (int i = 0; i < 4; i++) {
            System.out.println("\nInforme o nome, o preço e a quantidade em estoque do produto " + (i + 1) + ":");
            nome[i] = scanner.next();
            preco[i] = scanner.nextFloat();
            qtdEstoque[i] = scanner.nextInt();
        }

        System.out.println("\nAumentando o preço em 10% do produto 1 e 3");
        alteraPreco(preco, 0, 10);  // Produto 1
        alteraPreco(preco, 2, 10);  // Produto 3

        System.out.println("\nReduzindo o preço em 5% do produto 2");
        if (!alteraPreco(preco, 1, -5)) {
            System.out.println("\nErro: preço não alterado. Porcentagem inválida.");
        } else {
            System.out.println("\nPreço alterado com sucesso.");
        }

        System.out.println("\nAlterando o preço do produto 4");
        if (!alteraPreco(preco, 3, -110)) {
            System.out.println("\nErro: preço não alterado. Porcentagem inválida.");
        }

        // Exibindo produtos cadastrados
        System.out.println("\nProdutos Cadastrados:");
        for (int i = 0; i < 4; i++) {
            System.out.println("\nProduto: " + nome[i] +
                    "\nPreço: " + preco[i] +
                    "\nEstoque: " + qtdEstoque[i]);
        }

        scanner.close();
    }
}
