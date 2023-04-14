package unico;

public class Persona {

	public String nombre;
	public Integer edad;
	public Double peso;

	public static void main(String[] args) throws EdadException, PesoException {

		try {
			Persona persona = new Persona();
			persona.setNombre("Sergio");
			persona.setEdad(20);
			persona.setPeso(70.55);
		} catch (EdadException ee) {
			System.out.println(ee.getMessage());
		} catch (PesoException pe) {
			System.out.println(pe.getMessage());
		}

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) throws EdadException {
		if ((edad < 18) || (edad > 99)) {
			throw new EdadException("Edad Invalida.");
		}
		this.edad = edad;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) throws PesoException {
		if ((peso < 50.0) || (peso > 100.0)) {
			throw new PesoException("Peso Invalido.");
		}
		this.peso = peso;
	}

}
