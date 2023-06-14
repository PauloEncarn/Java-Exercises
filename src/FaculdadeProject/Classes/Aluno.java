package FaculdadeProject.Classes;

import java.util.Scanner;

public class Aluno {
	
	private	String cpf;
	private String nome;
	private Turma turma;
	
	
	public Aluno(String nome,String cpf) {
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

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	public Aluno cadastarAluno(Aluno novoAluino, Scanner sc) {
		
		
		String cpf ;
		String nome;
		
		System.out.println("CPF do aluno");
		cpf=sc.next();
		System.out.println("Nome do aluno");
		nome=sc.next();
		
		Aluno novoAluno = new Aluno(cpf,nome);
		
		sc.close();
		return novoAluno;
	}

	
}
