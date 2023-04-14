package model;

public class ActualException extends Exception{

	private static final long serialVersionUID = 1L;
	public ActualException(String mensaje) {
		super(mensaje);
	}
	static void actual(Integer stockActual, Integer stockMinimo)throws ActualException{
        if(stockActual < stockMinimo){
            throw new ActualException("stock Actual no válido");
        }
	}
	
}
