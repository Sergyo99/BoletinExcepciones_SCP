package model;

public class MinimException extends Exception{

	private static final long serialVersionUID = 1L;
	public MinimException(String mensaje) {
		super(mensaje);
	}
	static void minimo(String minimo)throws MinimException{
        if(minimo == null ){
            throw new MinimException("Precio no válido.");
        }
}
}
