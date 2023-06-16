package BancoProject.Classes;

public class Cliente {
	
	private String nome;
	private Character tipoC;
	private double saldo;
	
	
	public Cliente(String nome, Character tipoC) {
		
		this.nome = nome;
		this.tipoC = tipoC;
		this.saldo=0;
		
	}


	public String getNome() {
		return nome;
	}



	public Character getTipoC() {
		return tipoC;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	
	
	
}
