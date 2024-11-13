import java.util.Scanner;

public class FaceFriends{
    public static void main(String args[]) {
        Scanner x = new Scanner(System.in);
        Contato[] contatos = new Contato[6];

        contatos[0] = new Familia("Gege", "Geovana", "Ge@gmaail.com", "08/04/1970", "Mãe");
        contatos[1] = new Amigos("Simba", "Flávio", "Flavindopneu@gmail.com", "09/12/2005", 1);
        contatos[2] = new Trabalho("Porpeta", "Eduardo", "Bolota123@yahoo.com", "17/03/1989", "Chefe");
        contatos[3] = new Amigos("Magrin", "Marcelo", "Marcelo45g@gmail.com", "30/01/2008", 2);

        int op;
        do{
            System.out.println("MENU:\n1. Inserir contato\n2. Imprimir TODOS os contatos\n3. Imprimir familiares\n" +
                    "4. Imprimir amigos\n5. Imprimir trabalho\n6. Imprimir MA, Irmãos e Colega\n7. Imprimir específico");
            op = x.nextInt();

            if (op == 1) {
                contatos[4] = new Familia("Cnpjoto", "Vitor", "Cnpjoto@gmail.com", "21/02/2000", "Irmão");
                contatos[5] = new Trabalho("Calabreso", "Maria", "Maria08@gmail.com", "01/04/2004", "Colega");

                System.out.println("Inserção realizada com sucesso!");
                System.out.println();
            }

            if (op == 2) {
                for (Contato contato : contatos) {
                    if (contato instanceof Familia) {
                        contato.ImprimirContato();
                    }
                    if (contato instanceof Amigos) {
                        contato.ImprimirContato();
                    }
                    if (contato instanceof Trabalho) {
                        contato.ImprimirContato();
                    }
                    System.out.println();
                }
            }

            if (op == 3) {
                for (Contato contato : contatos) {
                    if (contato instanceof Familia) {
                        contato.ImprimirContato();
                    }
                }
                System.out.println();
            }

            if (op == 4) {
                for (Contato contato : contatos) {
                    if (contato instanceof Amigos) {
                        contato.ImprimirContato();
                    }
                }
                System.out.println();
            }

            if (op == 5) {
                for (Contato contato : contatos) {
                    if (contato instanceof Trabalho) {
                        contato.ImprimirContato();
                    }
                }
                System.out.println();
            }

            if (op == 6) {
                for (Contato contato : contatos) {
                    if (contato instanceof Familia && ((Familia) contato).parentesco.equals("Irmão")) {
                        contato.ImprimirContato();
                    }
                    if (contato instanceof Amigos && ((Amigos) contato).grau == 1) {
                        contato.ImprimirContato();
                    }
                    if (contato instanceof Trabalho && ((Trabalho) contato).tipo.equals("Colega")) {
                        contato.ImprimirContato();
                    }
                    System.out.println();
                }
            }

            if(op == 7){
                System.out.println("Digite o índice do contato que deseja ver: ");
                int opp = x.nextInt();

                for(int i = 0; i <= opp; i++){
                    if(i == opp){
                        if(contatos[i] instanceof Familia){
                            System.out.println("Família\n");
                            contatos[i].ImprimirContato();
                        }
                        if(contatos[i] instanceof Amigos){
                            System.out.println("Amigo\n");
                            contatos[i].ImprimirContato();
                        }
                        if(contatos[i] instanceof Trabalho){
                            System.out.println("Trabalho\n");
                            contatos[i].ImprimirContato();
                        }
                    }
                }
            }
        } while (op != 0);
    }
}
