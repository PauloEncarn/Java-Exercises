package FaculdadeProject.Classes;

import java.util.Scanner;

public class Professor {
	
	private	String cpf;
	private String nome;

	
	public Professor(String nome,String cpf) {
		this.cpf=cpf;
		this.nome=nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
     public Professor cadastarProfessor(Professor novoProfessor, Scanner sc) {
		
		
		String cpf ;
		String nome;
		
		System.out.println("CPF do Professor");
		cpf=sc.next();
		System.out.println("Nome do Professor");
		nome=sc.next();
		
		Professor novoProfessor1 = new Professor(cpf,nome);
		
		sc.close();
		return novoProfessor1;
	}


	
}
