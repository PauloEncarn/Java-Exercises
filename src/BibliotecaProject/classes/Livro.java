package BibliotecaProject.classes;


public class Livro {

	private String titulo;
	private Autor autor;
	private Boolean disponivel;
	
	

	public Livro(String titulo, Autor autor, Boolean disponivel) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.disponivel = disponivel;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Boolean getDisponivel() {
		return disponivel;
	}

	public void setDisponivel(Boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	
	
	
}
