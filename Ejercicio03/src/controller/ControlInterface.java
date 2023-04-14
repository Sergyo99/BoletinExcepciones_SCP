package controller;

import model.Productos;

public interface ControlInterface {

	void addProducto(Productos p) throws ArrayLlenoException;
	void delProducto(int pos) throws PosicionNoValidaException, ProductoNoEncontradoException;
	Productos getProducto(int pos) throws PosicionNoValidaException, ProductoNoEncontradoException;
	Productos[] lstProducto() throws ArrayVacioException;
	Double valorProducto(int pos) throws PosicionNoValidaException, ProductoNoEncontradoException;
	
	
}
