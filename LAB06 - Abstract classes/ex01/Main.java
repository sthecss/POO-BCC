public class Main{
    public static void main(String args[]){
        ContaCorrente contaCorrente = new ContaCorrente(50, 568, 123);

        if (contaCorrente.debitaValor(50, 123)){
            if(contaCorrente.getEstado(123) == 2){
                System.out.println("Conta cancelada.");
            }
        }

        System.out.println("Estado: " + contaCorrente.getEstado(123));
    }
}
