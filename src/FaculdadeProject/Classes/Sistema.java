package FaculdadeProject.Classes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Sistema {

	List<Aluno> alunosSistema = new ArrayList<>();
	List<Professor> professoresSistema = new ArrayList<>();
	List<Disciplina> disciplinasSistema = new ArrayList<>();
	List<Turma> turmasSistema = new ArrayList<>();

	public Sistema() {

	}

	public void cadastrarAluno() {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o nome do aluno: ");
		String nome = scanner.nextLine();
		System.out.print("Digite o CPF do aluno: ");
		String cpf = scanner.nextLine();
		Aluno aluno = new Aluno(nome, cpf);
		alunosSistema.add(aluno);

	}

	public void cadastrarProfessor() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o nome do professor: ");
		String nomeP = scanner.nextLine();
		System.out.print("Digite o CPF do professor: ");
		String cpfP = scanner.nextLine();
		Professor professor = new Professor(nomeP, cpfP);
		professoresSistema.add(professor);

	}

	public void cadastrarDisciplina() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o nome da disciplina: ");
		String nomeD = scanner.nextLine();
		Disciplina disciplina = new Disciplina(nomeD);
		disciplinasSistema.add(disciplina);

	}

	public void cadastrarTurma() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o código da turma: ");
		String cod = scanner.nextLine();
		Turma turma = new Turma(cod);
		turmasSistema.add(turma);

	}

	public void listarAlunos() {

		System.out.println("Alunos cadastrados");
		for (Aluno aluno : alunosSistema) {
			System.out.println(aluno.getNome() + aluno.getCpf());
		}
	}

	public void listarProfessores() {

		System.out.println("Professores cadastrados");
		for (Professor professor : professoresSistema) {
			System.out.println(professor.getNome() + professor.getCpf());
		}
	}

	public void listarDisciplinas() {

		System.out.println("Disciplinas cadastradas");
		for (Disciplina disciplina : disciplinasSistema) {
			System.out.println(disciplina.getNome_Disciplina() + disciplina.getProfessor());
		}
	}

	public void listarTurmas() {

		System.out.println("Turmas cadastradas");
		for (Turma turma : turmasSistema) {
			System.out.println(turma.getCod());
		}
	}

	public void excluirAluno() {

		Scanner sc = new Scanner(System.in);
		System.out.println("cpf do aluno que deseja excluir do sistema:");
		String cpf = sc.nextLine();
		for (Aluno aluno : alunosSistema) {
			if (aluno.getCpf().equalsIgnoreCase(cpf)) {
				alunosSistema.remove(aluno);
				return;
			} else
				System.out.println("aluno não encontrado");

		}
	}

	public void excluirProfessor() {

		Scanner sc = new Scanner(System.in);
		System.out.println("cpf do professor que deseja excluir do sistema:");
		String cpf = sc.nextLine();
		sc.close();
		for (Professor professor : professoresSistema) {
			if (professor.getCpf().equalsIgnoreCase(cpf)) {
				professoresSistema.remove(professor);
			} else
				System.out.println("professor não encontrado");

		}
	}

	public void inserirAlunoTurma() {
		
		    Scanner sc = new Scanner(System.in);
		    String cpf;
		    System.out.println("CPF do aluno que deseja inserir: ");
		    cpf = sc.next();
		    Sistema sistema = new Sistema();
		    
		    if(sistema.getAlunosSistema()!=null) {
		    	System.out.println("não nulo");
		    	
		    }else if(sistema.getAlunosSistema()==null && sistema.getAlunosSistema().isEmpty()) {
		    	System.out.println("nulo");
		    }
		    	


		    
		      
	}

	public List<Aluno> getAlunosSistema() {
		return alunosSistema;
	}

	public void setAlunosSistema(List<Aluno> alunosSistema) {
		this.alunosSistema = alunosSistema;
	}

	public List<Professor> getProfessoresSistema() {
		return professoresSistema;
	}

	public void setProfessoresSistema(List<Professor> professoresSistema) {
		this.professoresSistema = professoresSistema;
	}

	public List<Disciplina> getDisciplinasSistema() {
		return disciplinasSistema;
	}

	public void setDisciplinasSistema(List<Disciplina> disciplinasSistema) {
		this.disciplinasSistema = disciplinasSistema;
	}

	public List<Turma> getTurmasSistema() {
		return turmasSistema;
	}

	public void setTurmasSistema(List<Turma> turmasSistema) {
		this.turmasSistema = turmasSistema;
	}

}