package BancoProject.Classes;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cpf;
    
    private ArrayList<Conta> contas = new ArrayList<>();

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public Conta buscarConta(int numeroConta) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numeroConta) {
                return conta;
            }
        }
        return null;
    }
}