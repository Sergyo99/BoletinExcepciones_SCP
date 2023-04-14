package unico;

public class EdadException extends Exception {

	private static final long serialVersionUID = 1L;

	public EdadException(String msg) {
		super(msg);
	}

	static void Edad(int edad) throws EdadException {
		if ((edad < 18) || (edad > 99)) {
			throw new EdadException("Edad Invalida.");
		}
	}

}
