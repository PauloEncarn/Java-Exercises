package FaculdadeProject.Classes;

import java.util.Scanner;

public class Faculdade {

	public static void main(String[] args) {

		int opcao;
		Sistema sistema = new Sistema();
		Turma turma = new Turma();
		Scanner scanner = new Scanner(System.in);

		do {
			exibirMenu();
			opcao = scanner.nextInt();
			scanner.nextLine(); // Limpar o buffer do scanner

			switch (opcao) {
			case 1:
				sistema.cadastrarAluno();
				break;
			case 2:
				sistema.cadastrarProfessor();
				break;
			case 3:
				sistema.cadastrarDisciplina();
				break;
			case 4:
				sistema.cadastrarTurma();
				break;

			case 5:
				turma.addAluno();
				break;
			case 6:
				sistema.listarAlunos();
				break;
			case 7:
				sistema.listarProfessores();
				break;
			case 8:
				sistema.listarDisciplinas();
				break;
			case 9:
				sistema.listarTurmas();
				break;

			case 0:
				System.out.println("Encerrando o programa.");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
				break;
			}

			System.out.println();
		
		} while (opcao != 0);

		scanner.close();
	}

	

	private static void exibirMenu() {
		System.out.println("---- Menu de Cadastro ----");
		System.out.println("1. Cadastrar Aluno");
		System.out.println("2. Cadastrar Professor");
		System.out.println("3. Cadastrar Disciplina");
		System.out.println("4. Cadastrar Turma");
		System.out.println("5. Adicionar Aluno em uma turma");
		System.out.println("6. Listar Alunos");
		System.out.println("7. Listar professores");
		System.out.println("8. Listar Disciplinas");
		System.out.println("9. Listar Turmas");
		System.out.println("0. Sair");
		System.out.print("Escolha uma opção: ");
	}
}
