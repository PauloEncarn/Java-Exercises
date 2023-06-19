package BibliotecaProject.classes;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	private List<Livro> livros;
	
	
	public Biblioteca() {
		livros = new ArrayList<>();
	
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	
	public void adicionarLivro(Livro livro) {
	    livros.add(livro);
	}

	public void removerLivro(Livro livro) {

		this.livros.remove(livro);

	}

	public void buscarLivro(String nome) {

		for (Livro livro : livros) {

			if (livro.getTitulo().equalsIgnoreCase(nome)) {
					System.out.println("livro encontrada");
					System.out.println(livro.getTitulo()+livro.getAutor()+livro.getDisponivel());
			}else System.out.println("livro não encontrada");
		}

	}

	public void listarLivros() {
		
		for(Livro livro: livros) {
			System.out.println(livro.getTitulo() + livro.getAutor());
		}
	}
	
}
