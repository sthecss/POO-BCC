public class UsaBanco {
    public static void main(String args[]){
        ContaEspecial especial = new ContaEspecial(1223, 1000, 456, 10000);

        System.out.println("Valor da conta: " + especial.getSaldo(456));

        especial.creditaValor(456, 1000);

        System.out.println("Valor da conta: " + especial.getSaldo(456));

        System.out.println("Limite da conta: " +  especial.getLimite());

        especial.debitaValor(3000);

        System.out.println("Valor da conta: " + especial.getSaldo(456));

        System.out.println("Limite da conta: " +  (especial.getLimite() + especial.getSaldo(456)));

    }
}
