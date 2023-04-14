package unico;

public class PesoException extends Exception {

	private static final long serialVersionUID = 1L;

	public PesoException(String msg) {
		super(msg);
	}

	static void Peso(Double peso) throws PesoException {
		if ((peso < 50.0) || (peso > 100.0)) {
			throw new PesoException("Peso Invalido.");
		}
	}

}
