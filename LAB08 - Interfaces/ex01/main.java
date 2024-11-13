public class main {
    public static void main(String args[]){
        Produto[] produto = new Produto[3];
        Cliente[] cliente = new Cliente[3];
        Servico[] servico = new Servico[3];

        produto[0] = new Produto(10);
        produto[1] = new Produto(200);
        produto[2] = new Produto(3);
        cliente[0] = new Cliente("Arthur");
        cliente[1] = new Cliente("Pedro");
        cliente[2] = new Cliente("Maria");
        servico[0] = new Servico(3.00);
        servico[1] = new Servico(18.00);
        servico[2] = new Servico(0.75);

        imprime(produto);
        imprime(cliente);
        imprime(servico);
        System.out.println("\n");
        insertionSort(produto);
        insertionSort(cliente);
        insertionSort(servico);
        imprime(produto);
        imprime(cliente);
        imprime(servico);
    }

    public static Classificavel[] insertionSort(Classificavel[] v){
        int n = v.length;
        for(int i = 1; i < n; i++){
            Classificavel chave = v[i];
            int j = i - 1;

            while (j >= 0 && chave.MenorQue(v[j])){
                v[j + 1] = v[j];
                j = j - 1;
            }
            v[j + 1] = chave;
        }
        return v;
    }
    public static void imprime(Classificavel[] v){
        for(int i = 0; i < v.length; i++){
            v[i].imprime();
        }
    }
}

