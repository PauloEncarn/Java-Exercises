package BancoProject.Classes;

public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(int numero, String titular, double taxaRendimento) {
        super(numero, titular);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() {
        return this.taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento() {
        double rendimento = this.getSaldo() * (this.taxaRendimento / 100);
        this.depositar(rendimento);
    }
}