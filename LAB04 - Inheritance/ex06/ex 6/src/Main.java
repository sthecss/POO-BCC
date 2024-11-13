import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Ingresso camaroteInf = new CamaroteInf("1-A", 10);
        Ingresso camaroteSup = new CamaroteSup(30, 10);
        Ingresso ingresso = new Normal();

        ((Normal) ingresso).imprime();

        ((CamaroteInf) camaroteInf).imprimeCamInf();
        System.out.println();

        ((CamaroteSup) camaroteSup).imprimeCamSup();
    }
}
