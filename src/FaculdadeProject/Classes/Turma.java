package FaculdadeProject.Classes;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Turma {

	private String cod;
	private ArrayList<Aluno> Alunos;
	private ArrayList<Disciplina> Disciplinas;
	Sistema sistema = new Sistema();

	public Turma(String cod) {
		this.cod = cod;
	}

	public Turma() {
		// TODO Auto-generated constructor stub
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

	public void addAluno() {

		Scanner sc = new Scanner(System.in);

		System.out.println("qual aluno será manipulado? ");
		String cpf = sc.next();

		if (sistema.getAlunosSistema() != null) {
			for (Aluno aluno : sistema.getAlunosSistema()) {
				System.out.println("em qual turma ele será adiconado?");
				String cod = sc.next();

				if (sistema.getTurmasSistema() != null) {

					for (Turma turma : sistema.getTurmasSistema()) {
						if (cod == turma.getCod()) {
							if (cpf == aluno.getCpf()) {
								turma.getAlunos().add(aluno);
							}else System.out.println("aluno não encontrado");
						}else System.out.println("turma não encontrado");
					}
				}else System.out.println("SEM TURMAS CADASTRADAS");
			}
		}

	}

	public void addDisciplina(String nome, Disciplina Disciplina) {

		getDisciplinas().add(Disciplina);
	}
}
