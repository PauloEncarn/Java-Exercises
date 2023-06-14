package FaculdadeProject.Classes;

import java.util.Scanner;

public class Disciplina {

	private String nome_Disciplina;
	private Professor professor;
	
	
	public Disciplina(String nome_disciplina) {
		// TODO Auto-generated constructor stub
		this.nome_Disciplina=nome_disciplina;
	}

	public String getNome_Disciplina() {
		return nome_Disciplina;
	}


	public void setNome_Disciplina(String nome_Disciplina) {
		this.nome_Disciplina = nome_Disciplina;
	}


	public Professor getProfessor() {
		return professor;
	}


	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	
	  public Disciplina cadastarDisciplina(Disciplina novoDisciplina, Scanner sc) {
			
	
		  	String nome;
		   
			System.out.println("Nome da disciplina");
			nome=sc.next();
			
			Disciplina novaDisciplina = new Disciplina(nome);
			
			sc.close();
			return novaDisciplina;
		}

	
	
}
