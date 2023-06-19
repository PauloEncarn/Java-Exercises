package BibliotecaProject.classes;

import java.util.ArrayList;
import java.util.List;

public class SistemaBiblioteca {




	public static void main(String[] args) {
		
		
		List<Livro> listaLivro= new ArrayList<>();
		
		Autor autor= new Autor("pedro pascal", "brasileiro");
		Autor autor2= new Autor("Emily clark", "brasileiro");
		Livro livro = new Livro("CRONICAS DE NARNIA",autor, true);
		Livro livro2 = new Livro("HARRY POTTEGER",autor2, true);
		Biblioteca biblioteca= new Biblioteca();
		
		biblioteca.adicionarLivro(livro);
		
		System.out.println(biblioteca.getLivros().get(0).getAutor().getNome());		

	
	}
}
