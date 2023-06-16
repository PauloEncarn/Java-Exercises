package BancoProject.Classes;

public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(int numero, String titular, double limiteChequeEspecial) {
        super(numero, titular);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return this.limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
}