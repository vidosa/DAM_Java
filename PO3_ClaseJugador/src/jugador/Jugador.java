package jugador;

public class Jugador {
	// Propiedades de la Clase Jugador
	private String nombre;
	private String apellido1;
	private String apellido2;
	private int edad;
	private int puntuacion;
	private int id;

	// Constructor de la clase
	public Jugador() {

	}

	/*
	 * --------------------------
	 * Metodos setters y getters
	 * --------------------------
	 * */
	
	// Metodos para nombre
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	// Metodos para apellido1
	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	// Metodos para apellido2
	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	// Metodos para edad
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	// Metodos para puntuacion
	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	// Metodos para Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	/*
	 * -------------------------------------------------------
	 * Metodos para validar las propiedades de objetos Jugador
	 * -------------------------------------------------------
	 * */
	
	
	
	
	// Metodo que saca por consola las propiedades de un objeto Jugador
		public String toString() {
			return this.nombre+" "+this.apellido1+" "+this.apellido2+" "+this.edad;
		}
	

}// FIN DE LA CLASE JUGADOR
