package BancoProject.Classes;

import java.util.Random;

import BancoProject.Interfaces.Methods;

public abstract class ContaBancaria implements Methods {

	private int numConta;

	public ContaBancaria() {
		Random random = new Random();
        int numeroAleatorio = random.nextInt(900) + 100;
		this.numConta=numeroAleatorio;
			
	}

	public int getNumConta() {
		return numConta;
	}


	public double rendimento(double saldo) {
		return saldo;
	}

	public double manutenção(double valor) {
		return valor;
	}
	

	
	
}
