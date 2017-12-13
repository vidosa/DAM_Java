package principal;

// Se importan las clases del paquete ventanas
import ventanas.VentanaJuego;
import ventanas.VentanaLogin;


/*
 * EN LA CLASE PRINCIPAL SE CREAN Y LANZAN LAS VENTANAS DEL JUEGO
 * */
public class Principal {

	public static void main(String[] args) {
		// Se crea la ventana del juego
		VentanaJuego vJ = new VentanaJuego();

		// Se crea la ventana de login y se le pasa como referencia la ventana de juego
		// La ventana de login interactua con la clase jugador y con la ventana de juego
		VentanaLogin login = new VentanaLogin(vJ);
		// Se hace visible la ventana de login
		login.setVisible(true);

	}

}
