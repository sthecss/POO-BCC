public class ContaComum extends ContaCorrente {

    private float limite;
    public ContaComum(float val, int num, int pwd) {
        super(val, num, pwd);
        limite = 0;
    }

    public void debitaValor(float val) {
        if (val <= 0)
            return;
        if (val <= saldo) {
            saldo -= val;
        }
    }
}