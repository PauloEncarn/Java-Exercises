package FaculdadeProject.Utilidades;


public class MyException extends Exception {

	public MyException() {
		super();
	}

	public MyException(String mensagem) {
		super(mensagem);
	}

	public MyException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}

	public MyException(Throwable causa) {
		super(causa);
	}
}
