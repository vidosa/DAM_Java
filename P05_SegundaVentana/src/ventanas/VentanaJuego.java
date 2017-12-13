package ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import juego.Jugador;

public class VentanaJuego extends JFrame {

	private JPanel contentPane;
	private JLabel bienVenida;
	
	// Recogera el paso por referencia desde la ventana VentanaLogin
	private Jugador jugador;

	/**
	 * CONSTRUCTOR DE LA CLASE
	 */
	public VentanaJuego() {
		setTitle("JUEGO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 710);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 144, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		bienVenida = new JLabel("New label");
		bienVenida.setForeground(new Color(0, 0, 255));
		bienVenida.setBounds(12, 28, 285, 16);
		contentPane.add(bienVenida);

	}
	// Se le pasa una referencia a un objeto Jugador
	public void setJugador(Jugador jugador) {
		
		this.jugador = jugador;
		bienVenida.setText("Bienvenido al Juego "+jugador.getNombre());
	}

}// FIN DE LA CLASE
