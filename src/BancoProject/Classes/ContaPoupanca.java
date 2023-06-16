package BancoProject.Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContaPoupanca extends ContaBancaria {

	List<Cliente> listaClientes;
	private Cliente cliente;
	
	public ContaPoupanca() {
		
		List<Cliente> listaClientes= new ArrayList<>();
	}
	
	@Override
	public double atualizarSaldo() {
		
			Scanner sc= new Scanner(System.in);
			System.out.println("Deseja sacar ou depositar");
			System.out.println("1. sacar");
			System.out.println("2. depositar");
			int op= sc.nextInt();
			
			switch (op) {
			
			case 1: {
				
				System.out.println("Quando deseja sacar: ");
				Double valor= sc.nextDouble();
				
				return cliente.getSaldo()-valor;
			}
			
			case 2:{
				
				System.out.println("Quando deseja depositar: ");
				Double valor= sc.nextDouble();
				
				return cliente.getSaldo()+valor;
				
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + op);
			}
		
	}
	
	@Override
	public void abrirConta(Cliente cliente) {
		listaClientes.add(cliente);
		
	}

	@Override
	public void removerConta(Cliente cliente) {
		// TODO Auto-generated method stub
		
		listaClientes.remove(cliente);
	}
	
	
	public double rendimento(double saldo) {
	
		double saldoAtualizado =cliente.getSaldo()*1.15;
		
		return saldoAtualizado;
	}

}
