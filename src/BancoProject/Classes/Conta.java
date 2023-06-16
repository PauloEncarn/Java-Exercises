package BancoProject.Classes;

public class Conta {
    private int numero;
    private String titular;
    private double saldo;

    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Conta conta1 = new Conta(1, "João");
        Conta conta2 = new Conta(2, "Maria");

        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);

        Conta contaEncontrada = banco.buscarConta(1);
        System.out.println("Conta encontrada: " + contaEncontrada.getTitular());

        conta1.depositar(1000.0);
        conta1.sacar(500.0);
        System.out.println("Saldo da conta 1: " + conta1.getSaldo());
    }
}