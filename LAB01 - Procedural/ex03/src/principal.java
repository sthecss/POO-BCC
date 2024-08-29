import javax.xml.transform.Source;
import java.util.Scanner;

public class principal {

    public static void ex01(){
        System.out.println("========== EX 01 ==========");

        Scanner sc = new Scanner(System.in);
        int val1,val2,val3,val4,val5,val6;

        System.out.println("<< Listando um vetor >>");
        System.out.println("- Entre com o número 1:");
        val1 = sc.nextInt();

        System.out.println("- Entre com o número 2:");
        val2 = sc.nextInt();

        System.out.println("- Entre com o número 3:");
        val3 = sc.nextInt();

        System.out.println("- Entre com o número 4:");
        val4 = sc.nextInt();

        System.out.println("- Entre com o número 5:");
        val5 = sc.nextInt();

        System.out.println("- Entre com o número 6:");
        val6 = sc.nextInt();

        System.out.println("- Os valores lidos são:");
        System.out.printf("%d %d %d %d %d %d ", val1, val2, val3, val4, val5, val6);

    }

    public static void ex02(){
        System.out.println("========== EX 02 ==========");

        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");

        for (int i = 0; i < 6; i++){
            System.out.printf("- Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.println("- Os valores lidos são:");
        for (int i = 0; i < 6; i++){
            System.out.printf("%d ",vet[i]);
        }
    }

    public static void ex03() {
        System.out.println("========== EX 03 ==========");

        Scanner leitura = new Scanner(System.in);
        int[] vetorTres = new int[6];

        System.out.println("- Escreva 6 números inteiros: ");

        for(int i = 0; i < 6; i++){
            vetorTres[i] = leitura.nextInt();
        }

        System.out.println("== Números digitados: ==");
        for(int i = 0; i < 6; i++){
            System.out.printf(vetorTres[i] + "|");
        }

        System.out.println("\n");

        System.out.println("-> Agora, a ordem inversa dos números digitados: " );
        for(int i = 5; i >= 1; i--){
            System.out.printf(vetorTres[i] + "|");
        }
    }

    public static void ex04() {
        System.out.println("========== EX 04 ==========");

        Scanner leitura = new Scanner(System.in);
        float[] vetorQuatro = new float[6];
        int contador = 0;

        while(contador < 6){
            System.out.println("- Digite o " + (contador + 1) + " número par: ");
            vetorQuatro[contador] = leitura.nextFloat();

            if(vetorQuatro[contador] % 2 != 0){
                System.out.println("<< Número inválido! >>");
            }
            else{
                contador++;
            }
        }

        System.out.printf("<< Números pares digitados >>  " + "|");
        for(int i = 0; i < 6; i++){
            System.out.printf(vetorQuatro[i] + "|");
        }
    }

    public static void ex05() {
        System.out.println("========== EX 05 ==========");

        Scanner leitura = new Scanner(System.in);

        float[] vetorCinco = new float[5];

        System.out.println("- Digite 5 valores: ");
        for(int i = 0; i < 5; i++) {
            vetorCinco[i] = leitura.nextFloat();
        }

        System.out.printf("[ Números digitados ] " + "|");
        for(int i = 0; i < 5; i++){
            System.out.printf(vetorCinco[i] + "|");
        }

        float maiorElemento = vetorCinco[0];
            for(int i = 1; i < 5; i++) {
                if(vetorCinco[i] > maiorElemento){
                    maiorElemento = vetorCinco[i];
                }
            }
            System.out.println("\n>> O maior número do vetor eh: " + maiorElemento);

        float menorElemento = vetorCinco[0];
            for(int i = 1; i < 5; i ++){
                if(vetorCinco[i] < menorElemento){
                    menorElemento = vetorCinco[i];
                }
            }
            System.out.println(">> O menor número do vetor eh: " + menorElemento);

        float mediaElemento = 0;
            for (int i = 0; i < 5; i++){
                mediaElemento = mediaElemento + vetorCinco[i];
            }
            mediaElemento = mediaElemento/5;
            System.out.println(">> A media dos valores do vetor eh " + mediaElemento);

    }

    public static void ex06() {
        System.out.println("========== EX 06 ==========");

        Scanner leitura = new Scanner(System.in);
        float[] vetorSeis = new float[5];

        System.out.println("- Digite 5 valores: ");
        for(int i = 0; i < 5; i++) {
            vetorSeis[i] = leitura.nextFloat();
        }

        System.out.printf("- Números digitados: " + "|");
        for(int i = 0; i < 5; i++){
            System.out.printf(vetorSeis[i] + "|");
        }
        System.out.println("\n");

        float maior = vetorSeis[0];
            for(int i = 1; i < 5; i++) {
                if(vetorSeis[i] > maior){
                    maior = vetorSeis[i];
                }
            }
            for(int i = 0; i < 5; i++){
                if(vetorSeis[i] == maior){
                    System.out.println("- O maior número do vetor eh: " + maior + " e sua posição no vetor eh [" + i + "]");
                }
            }

        float menor = vetorSeis[0];
            for(int i = 1; i < 5; i ++){
                if(vetorSeis[i] < menor){
                    menor = vetorSeis[i];
                }
            }

            for(int i = 0; i < 5; i++){
                if(vetorSeis[i] == menor){
                    System.out.println("- O menor número do vetor eh: " + menor + " e sua posição no vetor eh [" + i + "]");
                }
            }
    }

    public static void ex07() {
        System.out.println("========== EX 07 ==========");

        Scanner leitura = new Scanner(System.in);
        float[] vetorSete = new float[5];

        for(int i = 0; i < 5; i++){
            System.out.println("- Digite a nota do aluno " + (i + 1) + ": ");
            vetorSete[i] = leitura.nextFloat();

            if(vetorSete[i] > 50){
                System.out.println("<< Nota inválida! >>");
                i--;
            }
        }

        for(int i = 0; i < 5; i++){
            System.out.println("-> Nota do aluno " + (i + 1) + ": " + vetorSete[i]);
        }

        for(int i = 0; i < 5; i++){
            vetorSete[i] *= 2;
        }

        System.out.println("-> Nota dos alunos depois da normalização: ");
        for(int i = 0; i < 5; i++){
            System.out.println("\n- Nota do aluno " + (i + 1) + ": " + vetorSete[i]);
        }
    }

    public static void ex08() {
        System.out.println("========== EX 08 ==========");

        Scanner leitura = new Scanner(System.in);
        float[] vetorOito  = new float[5];

        System.out.println("-> Digite 5 valores: ");
            for(int i = 0; i < 5; i++){
                vetorOito[i] = leitura.nextFloat();
            }

        float media = 0;
            for(int i = 0; i < 5; i++){
                media += vetorOito[i];
            }
            media = media / 5;
            System.out.println("\n- O valor da média é: " + media);

        float dp = 0;
                for(int i = 0; i < 5; i++){
                    dp += (float) Math.pow(vetorOito[i] - media, 2);
                }
                dp = dp / (5 - 1);
                dp = (float) Math.sqrt(dp);
                System.out.println("\n- O valor do desvio padrão é: " + dp);
    }

    public static void ex09() {
        System.out.println("========== EX 09 ==========");

        Scanner leitura = new Scanner(System.in);
        int numeroAlunos = 0;
        float mediaDasNotas = 0;
        int contador = 0;

        while(contador < 1) {
            System.out.println("Digite o número de alunos de uma classe: ");
            numeroAlunos = leitura.nextInt();

            if (numeroAlunos > 100) {
                System.out.println("\nDigite um número de alunos menor do que 100!");
            }
            else{
                contador++;
            }
        }
        float[] vetorNove = new float[numeroAlunos];

        System.out.println("Digite as notas de cada aluno: ");
        for(int i = 0; i < numeroAlunos; i++){
            System.out.printf("Aluno " + (i + 1) + ": ");
            vetorNove[i] = leitura.nextFloat();
        }

        System.out.println("\n");

        for(int i = 0; i < numeroAlunos; i++){
            System.out.println("A nota do aluno " + (i + 1) + " eh: " + vetorNove[i]);
            mediaDasNotas += vetorNove[i];
        }
        mediaDasNotas = mediaDasNotas / numeroAlunos;

        System.out.println("- A média das notas eh: " + mediaDasNotas);
    }

    public static void ex10() {
        System.out.println("========== EX 10 ==========");

        Scanner leitura = new Scanner(System.in);

        int[] vetorDezA = new int[3];
        int[] vetorDezB = new int[3];
        int[] vetorDezC = new int[3];

        for(int i = 0; i < 3; i++){
            System.out.println("Digite um valor para a posição " + i + " do vetor A: ");
            vetorDezA[i] = leitura.nextInt();
            System.out.println("Digite um valor para a posição " + i + " do vetor B: ");
            vetorDezB[i] = leitura.nextInt();

            System.out.println();

            vetorDezC[i] = vetorDezA[i] - vetorDezB[i];
        }

        System.out.printf("Array A: " + "|");
            for(int i = 0; i < 3; i++){
                System.out.printf(vetorDezA[i] + "|");
            }
            System.out.println("\n");

        System.out.printf("Array B: " + "|");
            for(int i = 0; i < 3; i++){
                System.out.printf(vetorDezB[i] + "|");
            }
            System.out.println("\n");

        System.out.println("O vetor C, definido como A-B eh: ");
            System.out.printf("Array C: " + "|");
            for(int i = 0; i < 3; i++){
                System.out.printf(vetorDezC[i] + "|");
            }
            System.out.println("\n");
    }

    public static void ex11() {
        System.out.println("========== EX 11 ==========");

        Scanner leitura = new Scanner(System.in);
        int[] vetorOnze = new int[5];

        for(int i = 0; i < 5; i++){
            System.out.println("Digite o " + i + " para o vetor V: ");
            vetorOnze[i] = leitura.nextInt();
        }

        int[] vetorOnzePar = new int[5];
        int[] vetorOnzeImpar = new int[5];

        for(int i = 0; i < 5; i++){
            if(vetorOnze[i] % 2 == 0){
                vetorOnzePar[i] = vetorOnze[i];
            }
            else{
                vetorOnzeImpar[i] = vetorOnze[i];
            }
        }

        System.out.printf("- O vetor lido eh: " + "|");
            for(int i = 0; i < 5; i++){
                System.out.printf(vetorOnze[i] + "|");
            }
            System.out.println("\n");

        System.out.printf("- O vetor com numeros pares eh: " + "|");
            for(int i = 0; i < 5; i++){
                System.out.printf(vetorOnzePar[i] + "|");
            }
            System.out.println("\n");

        System.out.printf("- O vetor com numeros impares eh: " + "|");
            for(int i = 0; i < 5; i++){
                System.out.printf(vetorOnzeImpar[i] + "|");
            }
            System.out.println("\n");
    }

    public static void ex12() {
        System.out.println("========== EX 12 ==========");

        Scanner leitura = new Scanner(System.in);
        int[] vetorDoze = new int[4];
        int soma = 0;
        float media = 0;

        System.out.println("- Informe a quantidade de bolinhas: \n");
            System.out.println("-> Verdes: ");
            vetorDoze[0] = leitura.nextInt();

            System.out.println("-> Azuis: ");
            vetorDoze[1] = leitura.nextInt();

            System.out.println("-> Amarelas: ");
            vetorDoze[2] = leitura.nextInt();

            System.out.println("-> Vermelhas: ");
            vetorDoze[3] = leitura.nextInt();

        for (int i = 0; i < 4; i++) {
            soma += vetorDoze[i];
        }

        int maiorQuantidade = vetorDoze[0];
        for (int i = 1; i < 4; i++) {
            if (vetorDoze[i] > maiorQuantidade) {
                maiorQuantidade = vetorDoze[i];
            }
        }

        String[] cores = {"Verdes", "Azuis", "Amarelas", "Vermelhas"};

        for (int i = 0; i < 4; i++) {
            float percentual = (float) vetorDoze[i] / soma * 100;
            System.out.printf("\nPercentual de bolinhas %s: %.2f%%", cores[i], percentual);

            if (vetorDoze[i] == maiorQuantidade) {
                System.out.printf(" (%s tem maior probabilidade)", cores[i]);
            }
        }
    }

    public static void ex13() {
        System.out.println("========== EX 13 ==========");

        Scanner leitura = new Scanner(System.in);
        int[] vetorTreze = new int[5];

        for(int i = 0; i < 5; i++){
            System.out.println("-> Digite o " + i + " de um vetor: ");
            vetorTreze[i] = leitura.nextInt();
        }

        for(int i = 0; i < 5; i++){
            if(vetorTreze[i] < 0){
                vetorTreze[i] = 0;
            }
        }

        System.out.printf("\n-> Se retirarmos os elementos negativos, o vetor fica: " + "|");
        for(int i = 0; i < 5; i++){
            System.out.printf(vetorTreze[i] + "|");
        }
    }
    public static void ex14() {
        System.out.println("========== EX 14 ==========");

        Scanner leitura = new Scanner(System.in);

        System.out.println("- Universidade Federal de Uberlândia -\n");

        int numeroDeAlunos = 0;
        boolean entradaValida = true;

        while (entradaValida) {
            System.out.println("-> Digite quantos alunos você deseja cadastrar: ");
            numeroDeAlunos = leitura.nextInt();

            if (numeroDeAlunos > 10000) {
                System.out.println("<< Número de alunos excedido! Máx.: 10.000 >>\n");
            } else if (numeroDeAlunos <= 0) {
                System.out.println("<< Número de alunos insuficientes! Mín.: 1 >>\n");
            } else {
                entradaValida = false;
            }
        }

        System.out.println();

        int[] matriculas = new int[numeroDeAlunos];
        char[] classesSociais = new char[numeroDeAlunos];
        double[] cras = new double[numeroDeAlunos];

        for (int i = 0; i < numeroDeAlunos; i++) {
            System.out.println("-> Digite o número da matrícula do aluno " + (i + 1) + ": ");
            matriculas[i] = leitura.nextInt();
            System.out.println("-> Digite a classe social do aluno " + (i + 1) + ": ");
            classesSociais[i] = leitura.next().charAt(0);
            System.out.println("-> Digite o CRA do aluno " + (i + 1) + ": ");
            cras[i] = leitura.nextDouble();

            System.out.println();
        }

        System.out.println("\n-- Alunos Cadastrados --\n");

        for (int i = 0; i < numeroDeAlunos; i++) {
            System.out.println("- Matrícula do aluno " + (i + 1) + ": " + matriculas[i]);
            System.out.println("- Classe social " + (i + 1) + ": " + classesSociais[i]);
            System.out.println("- CRA " + (i + 1) + ": " + cras[i]);
        }
    }

    public static void ex15() {
        System.out.println("========== EX 15 ==========");

        Scanner leitura = new Scanner(System.in);

        int[] valores = new int[8];
        int[] valoresRepetidos = new int[8];

        for (int i = 0; i < 8; i++) {
            System.out.println("-> Digite o " + (i + 1) + " valor do vetor: ");
            valores[i] = leitura.nextInt();
            valoresRepetidos[i] = 0;
        }

        for (int i = 0; i < 8; i++) {
            int valorAtual = valores[i];
            boolean repetido = false;

            for (int j = 0; j < i; j++) {
                if (valores[j] == valorAtual) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                for (int j = i + 1; j < 8; j++) {
                    if (valores[j] == valorAtual) {
                        valoresRepetidos[i] = valorAtual;
                        break;
                    }
                }
            }
        }

        System.out.print("\n- Elementos repetidos no array: |");
        for (int i = 0; i < 8; i++) {
            if (valoresRepetidos[i] != 0) {
                System.out.print(valoresRepetidos[i] + "|");
            }
        }
        System.out.println();
    }

    public static void ex16() {
        System.out.println("========== EX 16 ==========");

        Scanner leitura = new Scanner(System.in);

        int[] valores = new int[8];

        for (int i = 0; i < 8; i++) {
            System.out.println("- Digite o valor da posição " + i + " do vetor: ");
            valores[i] = leitura.nextInt();
        }

        for (int i = 0; i < 8; i++) {
            int valorAtual = valores[i];
            int contagem = 0;

            for (int j = 0; j < 8; j++) {
                if (valores[j] == valorAtual) {
                    contagem++;
                }
            }

            if (contagem > 1) {
                System.out.println("- O valor " + valorAtual + " aparece " + contagem + " vezes!");
            }
        }
    }

    public static void main(String[] args){
        int escolha;

        do{
            System.out.print("\n\n <<< Escolha alguma questâo de 1 a 16! >>> \n- Para sair,basta digitar -1.\n-> ");
            Scanner op = new Scanner(System.in);
            escolha = op.nextInt();

            switch (escolha){
                case 1:
                    ex01();
                    break;

                case 2:
                    ex02();
                    break;

                case 3:
                    ex03();
                    break;

                case 4:
                    ex04();
                    break;

                case 5:
                    ex05();
                    break;

                case 6:
                    ex06();
                    break;

                case 7:
                    ex07();
                    break;

                case 8:
                    ex08();
                    break;

                case 9:
                    ex09();
                    break;

                case 10:
                    ex10();
                    break;

                case 11:
                    ex11();
                    break;

                case 12:
                    ex12();
                    break;

                case 13:
                    ex13();
                    break;

                case 14:
                    ex14();
                    break;

                case 15:
                    ex15();
                    break;

                case 16:
                    ex16();
                    break;

                case -1:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }while(escolha != -1);
    }
}