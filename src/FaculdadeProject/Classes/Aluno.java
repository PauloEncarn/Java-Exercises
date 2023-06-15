package FaculdadeProject.Classes;


public class Aluno {
	
	private	String cpf;
	private String nome;
	private Turma turma;
	
	
	public Aluno(String nome,String cpf) {
		this.cpf=cpf;
		this.nome=nome;
	
	}
	
	public Aluno() {
		
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
	
	
}
