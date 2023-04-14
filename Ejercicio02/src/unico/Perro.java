package unico;

public class Perro {

	private String raza;
	private Integer edad;
	private Double altura;

	public static void main(String[] args) {

		try {
			Perro perro = new Perro();
			perro.setRaza(null);
			perro.setEdad(3);
			perro.setAltura(52.55);
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		if (raza == null)
			throw new RuntimeException("La raza debe indicarse.");
		this.raza = raza;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		if (edad <= 0)
			throw new RuntimeException("La edad es invalida.");
		this.edad = edad;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		if (altura <= 0)
			throw new RuntimeException("La altura es invalida.");
		this.altura = altura;
	}

}
