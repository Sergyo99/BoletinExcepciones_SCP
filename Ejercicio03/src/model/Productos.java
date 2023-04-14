package model;

public class Productos {

	private String nombre;
	private Integer stockActual;
	private Integer stockMinimo;
	private Double precioUd;

	public Productos(String nombre, Integer stockActual, Integer stockMinimo, Double precioUd)
			throws NomException, ActualException, MinimException {
		setNombre(nombre);
		setStockMinimo(0);
		setStockActual(0);
		setPrecioUd(0.0);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws NomException {
		if (getNombre() == null) {
			throw new NomException("No se ha introducido ningún nombre.");
		}
		this.nombre = nombre;
	}

	public Integer getStockActual() {
		return stockActual;
	}

	public void setStockActual(Integer stockActual) throws ActualException {
		if (stockActual < getStockMinimo()) {
			throw new ActualException("Stock Actual no válido");
		}
		this.stockActual = stockActual;
	}

	public Integer getStockMinimo() {
		return stockMinimo;
	}

	public void setStockMinimo(Integer stockMinimo) throws MinimException {
		if (stockActual < 0) {
			throw new MinimException("Stock Actual no válido");
		}
		this.stockMinimo = stockMinimo;
	}

	public Double getPrecioUd() {
		return precioUd;
	}

	public void setPrecioUd(Double precioUd) {
		this.precioUd = precioUd;
	}

	@Override
	public String toString() {
		return "Productos [getNombre()=" + getNombre() + ", getStockActual()=" + getStockActual()
				+ ", getStockMinimo()=" + getStockMinimo() + ", getPrecioUd()=" + getPrecioUd() + "]";
	}

}
