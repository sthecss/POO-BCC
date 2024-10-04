import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("|        I N I C I A N D O        |");
        System.out.println("===================================");

        System.out.print("\n-> Quantos times deseja cadastrar? ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        Time[] times = new Time[n];
        Time timeComMaiorMediaIdade = null;
        double maiorMediaIdade = 0;

        // Cadastro dos times
        for (int i = 0; i < n; i++) {
            System.out.println("\n-> Cadastrando o time " + (i + 1) + ":");
            times[i] = cadastrarTime(scanner);

            double mediaIdadeAtual = times[i].calculaMedia();

            if (mediaIdadeAtual > maiorMediaIdade) {
                maiorMediaIdade = mediaIdadeAtual;
                timeComMaiorMediaIdade = times[i];
            }
        }

        // Exibir informações dos times cadastrados
        System.out.println("\n==============> Informações dos times cadastrados:");
        for (int i = 0; i < n; i++) {
            System.out.println(times[i].toString());
            System.out.println("\n");
        }

        // Exibir time com a maior média de idade
        if (timeComMaiorMediaIdade != null) {
            System.out.println("\n-> Time com a maior média de idade:");
            System.out.println(timeComMaiorMediaIdade);
            System.out.println("\n-> Com média de idade: " + maiorMediaIdade);
        }

        scanner.close();
    }

    public static Time cadastrarTime(Scanner scanner) {
        System.out.print("Informe o nome do time: ");
        String nome = scanner.nextLine();

        Jogador[] titulares = new Jogador[2];

        for (int j = 0; j < 2; j++) {
            System.out.println("Cadastrando titular " + (j + 1) + ":");
            titulares[j] = cadastrarJogador(scanner);
        }

        System.out.print("Deseja cadastrar um substituto? (s/n): ");
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("s")) {
            System.out.println("Cadastrando substituto:");
            Jogador substituto = cadastrarJogador(scanner);
            return new Time(nome, titulares, substituto);
        }

        return new Time(nome, titulares);
    }

    public static Jogador cadastrarJogador(Scanner scanner) {
        System.out.print("Nome do jogador: ");
        String nome = scanner.nextLine();

        System.out.print("Idade do jogador: ");
        int idade = scanner.nextInt();

        System.out.print("Peso do jogador: ");
        double peso = scanner.nextDouble();

        System.out.print("Altura do jogador: ");
        double altura = scanner.nextDouble();

        scanner.nextLine(); // NAO POSSO ESQUECER DE LIMPAR O BUFFER MAIS

        return new Jogador(nome, idade, peso, altura);
    }
}
