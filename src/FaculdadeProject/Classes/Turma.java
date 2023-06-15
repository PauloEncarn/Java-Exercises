package FaculdadeProject.Classes;

import java.util.ArrayList;



public class Turma {

	private String cod;
	private ArrayList<Aluno> Alunos;
	private ArrayList<Disciplina> Disciplinas;
	

	public Turma(String cod) {
		this.cod = cod;
	}

	public Turma() {
		
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public ArrayList<Aluno> getAlunos() {
		return Alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		Alunos = alunos;
	}

	public ArrayList<Disciplina> getDisciplinas() {
		return Disciplinas;
	}

	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		Disciplinas = disciplinas;
	}


}
