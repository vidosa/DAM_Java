package juego;

public class Jugador {
	// Propiedades o atributos de la Clase Jugador
	private String nombre;
	private String apellido1;
	private String apellido2;
	private int edad;
	private int puntuacion;
	private int id;

	// Constructor por defecto
	public Jugador() {

	}

	// Constructor con parametros de la clase y estado inicial de un objeto Jugador
	public Jugador(String nombre, String apellido1, String apellido2, int edad) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.edad = edad;
	}

	/* ----Metodos setters(Escribir) y getters (Leer)---- */

	// Metodo para leer nombre
	public String getNombre() {
		return nombre;
	}

	// Metodo para escribir nombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Metodos para leer apellido1
	public String getApellido1() {
		return apellido1;
	}

	// Metodo para escribir apellido1
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	// Metodos para leer apellido2
	public String getApellido2() {
		return apellido2;
	}

	// Metodo para escribir apellido2
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	// Metodos para leer edad
	public int getEdad() {
		return edad;
	}

	// Metodo para escribir edad
	public void setEdad(int edad) {
		this.edad = edad;
	}

	// Metodo para leer puntuacion
	public int getPuntuacion() {
		return puntuacion;
	}

	// Metodo para escribir puntuacion
	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	// Metodos para leer Id
	public int getId() {
		return id;
	}

	// Metodo para escribir Id
	public void setId(int id) {
		this.id = id;
	}

	/*----Metodos para validar las propiedades de objetos Jugador----*/

	/*
	 * Este metodo devuelve true si la cadena no esta vacia. Ademas borra los
	 * espacios iniciales y finales de la misma si los hay.
	 */
	/*
	 * public boolean sonEspacios(String cad) { if(!(cad.trim().isEmpty())) { return
	 * true; }else { return false; } return (!(cad.trim().isEmpty())); }
	 */
	/*
	 * No existe en la API de java un metodo que compruebe si un String es un
	 * numero. No obstante podemos utilizar la estructura try....catch para
	 * controlar la comprobacion y el metodo parseInt de la clase Integer para
	 * determinar si la cadena es numerica.
	 * 
	 */
	public boolean isNumeric(String cad) {
		try {
			Integer.parseInt(cad);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}

	/*
	 * Este metodo devuelve true si la cadena no contiene espacios vacios. Recibe
	 * como argumento un String y mediante un bucle for recorre la longitud de la
	 * cadena de caracteres. El metodo lenght() devuelve el numero de caracteres del
	 * String. El metodo charAt devuelve el caracter situado en la posicion del
	 * indice , si es distinto de ' ' significa que la cadena no contiene espacios
	 * vacios
	 */
	public boolean sonEspacios1(String cad1) {
		for (int i = 0; i < cad1.length(); i++)
			if (cad1.charAt(i) != ' ')
				return false;

		return true;
	}

	// Metodo que imprime las propiedades de un objeto Jugador.
	public String toString() {
		return this.nombre + " " + this.apellido1 + " " + this.apellido2 + " " + this.edad;
	}

}// FIN DE LA CLASE JUGADOR
