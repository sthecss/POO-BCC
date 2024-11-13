public class ContaEspecial extends ContaCorrente {
    private float limite;

    public ContaEspecial(float val, int num, int pwd, float limite) {
        super(val, num, pwd);
        this.limite = limite;
    }

    public void debitaValor(float val) {
        if (val <= 0)
            return;
        if (val <= saldo + limite) {
            saldo -= val;
        }
    }

    public float getLimite() {
        return limite;
    }
}