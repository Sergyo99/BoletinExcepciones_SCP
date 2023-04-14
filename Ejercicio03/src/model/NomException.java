package model;

public class NomException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public NomException(String mensaje) {
		super();
	}
	static void Nombre(String nombre)throws NomException{
        if((nombre == null )){
            throw new NomException("No se ha introducido ningún nombre.");
        }
}

	
}
