package controller;

import model.Productos;

public class Cntrl implements ControlInterface {

	private Productos[] producto;
	private Integer n;

	public Cntrl(int total) {
		producto = new Productos[total];
		n = 0;
	}

	@Override
	public void addProducto(Productos p) throws ArrayLlenoException {
		boolean ok = false;
		for (int i = 0; i < producto.length; i++) {
			if (producto[i] == null) {
				producto[i] = p;
				ok = true;
				break;
			}
			if (!ok) {
				throw new ArrayLlenoException();
			}
		}
	}

	@Override
	public void delProducto(int pos) throws PosicionNoValidaException, ProductoNoEncontradoException {
		if (pos < 0 || pos >= n) {
			throw new PosicionNoValidaException();
		}
		if (producto[pos] == null) {
			throw new ProductoNoEncontradoException();
		}
		producto[pos] = null;

	}

	@Override
	public Productos getProducto(int pos) throws PosicionNoValidaException, ProductoNoEncontradoException {
		if (pos < 0 || pos >= n) {
			throw new PosicionNoValidaException();
		}
		if (producto[pos] == null) {
			throw new ProductoNoEncontradoException();
		}
		return producto[pos];
	}

	@Override
	public Productos[] lstProducto() throws ArrayVacioException {
		Productos[] tmp;
		/*
		 * if (n == 0) throw new ArrayVacioException();
		 * 
		 * Productos[] listaProductos = new Productos[n]; for (int i = 0; i < n; i++) {
		 * listaProductos[i] = producto[i]; } return listaProductos;
		 */

		// contar cuantos productos hay en el array producto
		int cont = 0;
		for (int i = 0; i < producto.length; i++) {
			if (producto[i] != null) {
				cont++;
			}
		}
		// si no hay prodcutos → excepcion
		if (cont == 0) {
			throw new ArrayVacioException();
		}
		// Una vez que se sabe cuantos productos hay, dimensinamos el array
		tmp = new Productos[cont];
		// guadar en el array tmp los productos del array producto(no nulos)
		int pos = 0;
		for (int i = 0; i < producto.length; i++) {
			if (producto[i] != null) {
				tmp[pos] = producto[i];
				if (pos == cont) {
					break;
				}
			}

		}
		// devolvemos el array tmp
		return tmp;
	}

	@Override
	public Double valorProducto(int pos) throws PosicionNoValidaException, ProductoNoEncontradoException {
		if (pos < 0 || pos >= n) {
			throw new PosicionNoValidaException();
		}
		if (producto[pos] == null) {
			throw new ProductoNoEncontradoException();
		}
		return producto[pos].getStockActual() * producto[pos].getPrecioUd();

	}

}
